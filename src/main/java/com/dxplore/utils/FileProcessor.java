/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.utils;

import com.dxplore.tsql.tsqlLexer;
import com.dxplore.tsql.tsqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Stream;

/**
 * Sequential file processing using Stream API
 * Created by motty on 18/02/2016.
 */
public class FileProcessor {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(FileProcessor.class);

    // Blocking statements qqueue
    private static BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10000);

    // String joiner for statements
    private static StringJoiner joiner = null;

    // Previous line
    private static int depth = 0;

    // Flag to indicate statement has started
    private static boolean statementStartIdentified = false;

    // Flag to indicate statement has ended
    private static boolean statementEndIdentified = false;

    private final LongAdder adder = new LongAdder();

    /**
     * Process the file
     */
    public void process() {
        try {

            logger.info(String.format("Start processing file: %s", Application.INPUT_FILE));

            // Mark start time
            long start = System.currentTimeMillis();

            // Build and start thread pool for statement processing
            ExecutorService executor = Executors.newFixedThreadPool(Application.WORKERS);
            this.startProcessStatements(executor);

            // Parse the file line by line withStream API
            Path path = Paths.get(Application.INPUT_FILE);
            Stream<String> lines = Files.lines(path);

            lines.map(FileProcessor::removeSpecialChars)
                    .map(FileProcessor::removeComments)
                    .map(FileProcessor::calculateDepth)
                    .forEach(FileProcessor::groupLines);

            // Handle the last statement
            if (joiner != null) {
                queue.put(String.format("%s", joiner.toString()));
            }


            // Wait before shutdown
            while (queue.size() > 0) {
                Thread.sleep(100);
            }
            executor.shutdown();
            executor.awaitTermination(10, TimeUnit.SECONDS);


            // Write joins to a file
            //this.printOutput();

            // Mark end time
            long end = System.currentTimeMillis();
            logger.info(String.format("%d statements processing completed within %d milliseconds.", this.adder.intValue(), (end - start)));

        } catch(Exception ex) {
            logger.error("Error running the application: " + ex.getMessage());
        }
    }

    /**
     * Remove comments from the line
     * @param line
     * @return
     */
    private static String removeComments(String line) {
        try {
            int pos = line.indexOf("--");
            return (pos < 0) ? line : line.substring(0, pos);
        } catch (Exception ex) {
            logger.error("Error removeComments: " + ex.getMessage());
            return line;
        }
    }

    /**
     * Remove special characters
     * @param line
     * @return
     */
    private static String removeSpecialChars(String line) {
        try {
            if (line.contains("@@")) return "";
            return line.replace("\"", "").replace("\t", " ").replace("[", "").replace("]", "").replace("WITH(NOLOCK)", "").trim();
        } catch (Exception ex) {
            logger.error("Error removeSpecialChars: " + ex.getMessage());
            return line;
        }
    }

    /**
     * Calculate depth of parentheses
     * @param line
     * @return
     */
    private static String calculateDepth(String line) {
        long c1 = line.chars().filter((c) -> { return (c == "(".charAt(0));}).count();
        long c2 = line.chars().filter((c) -> { return (c == ")".charAt(0));}).count();
        depth += (c1 - c2);
        return line;
    }

    // Group lines to statements

    /**
     * Group statements lines to a single statement
     * @param line
     */
    private static void groupLines(String line) {

        // Ignore empty or null
        if ((line == null) || (line.isEmpty())) return;

        checkStartOfStatement(line);
        checkEndOfStatement(line);

        try {
            if (statementStartIdentified) {
                // Save the previous statement
                if (joiner != null) {
                    queue.put(joiner.toString());
                }

                // Reset and start new joiner
                joiner = new StringJoiner(" ");
                joiner.add(line);

                statementStartIdentified = false;
            } else {
                if (joiner != null) {
                    joiner.add(line);
                }
            }

        } catch (Exception ex) {
            logger.error("Error during group lines", ex);
        }
    }

    /**
     * Identify start of select statement using the following conditions:
     * 1. Line starts with select and it is not a sub-query
     * @param line
     */
    private static void checkStartOfStatement(String line) {
        statementStartIdentified = ((line.toLowerCase().startsWith("select")) && (depth == 0));
    }

    /**
     * Identify end of select statement using the following conditions:
     * 1. Line ends with semicolon
     * 2.
     * @param line
     */
    private static void checkEndOfStatement(String line) {
        statementEndIdentified = (line.endsWith(";")) ? true : false;
    }

    /**
     * Start processing normalized SQL statements using thread pool
     * @param executor
     */
    private void startProcessStatements(ExecutorService executor) {
        new Thread(() -> {
            try {
                int counter = 0;
                boolean hasItems = true;
                while (hasItems) {
                    String statement = queue.poll(10, TimeUnit.SECONDS);
                    if (statement == null) {
                        //System.out.println("queue has no items");
                        hasItems = false;
                    } else {
                        final int number = counter++;
                        executor.submit(() -> {
                            this.processStatement(statement, number);
                        });
                    }
                }
            } catch (InterruptedException ex) {
                logger.error("Interrupted during poll", ex);
            }
        }).start();
    }

    /**
     * Process full SQL statement
     * @param stat SQL statement
     * @param number line number
     */
    public void processStatement(String stat, int number) {

        try {

            if (stat.isEmpty()) return;

            this.adder.increment();

            tsqlLexer lexer = new tsqlLexer(new ANTLRInputStream(stat));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            tsqlParser parser = new tsqlParser(tokens);
            AntlrJoinListener listener = new AntlrJoinListener(stat, number);
            parser.addParseListener(listener);
            parser.addErrorListener(new AntlrErrorListener());
            parser.sql_clause();

        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }

    /**
     * Write the output to the console
     */
    private void printOutput() {

        Application.getModel().getJoins().values().stream().forEach((cje) -> {
            if (cje.hasError()) {
                System.err.println(cje.getError());
            } else {
                System.out.println(cje.getText(Application.TENANT_NAME, Application.DATABASE_NAME));
            }
        });
    }
}
