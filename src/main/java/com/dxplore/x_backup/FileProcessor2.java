/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.x_backup;

import com.dxplore.model.CompoundJoinEntity;
import com.dxplore.plsql.plsqlLexer;
import com.dxplore.plsql.plsqlParser;
import com.dxplore.utils.AntlrErrorListener;
import com.dxplore.utils.AntlrJoinListener;
import com.dxplore.utils.Application;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;
import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * Sequential file processing using Stream API
 * Created by motty on 18/02/2016.
 */
public class FileProcessor2 {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(FileProcessor2.class);

    // Blocking statements qqueue
    private static BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10000);

    // String joiner for statements
    private static StringJoiner joiner = null;

    public void process() {
        try {

            // Mark start time
            long start = System.currentTimeMillis();

            // Build and start thread pool for statement processing
            ExecutorService executor = Executors.newFixedThreadPool(Application.WORKERS);
            this.startProcessStatements(executor);

            // Parse the file line by line withStream API
            Path path = Paths.get(Application.INPUT_FILE);
            Stream<String> lines = Files.lines(path);
            lines.map(FileProcessor2::removeSpecialChars).map(FileProcessor2::removeComments).forEach(FileProcessor2::groupLines);

            // Handle the last statement
            if (joiner != null) {
                queue.put(String.format("SELECT * %s", joiner.toString()));
            }

            // Shutdown and wait for all tasks to complete
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.HOURS);


            // Write joins to a file
            this.writeOutput();
            this.printOutput();

            // Mark end time
            long end = System.currentTimeMillis();
            logger.info(String.format("file process completed within %d milliseconds.", (end - start)));

        } catch(Exception ex) {
            logger.error("Error running the application" + ex);
        }
    }

    // This transform removes all comments
    private static String removeComments(String line) {
        int pos = line.indexOf("--");
        return (pos < 0) ? line : line.substring(0, pos);
    }

    // This transform removes all comments
    private static String removeSpecialChars(String line) {
        return line.replace("\"", "").replace("\t", " ").replace("[", "").replace("]", "").replace("WITH(NOLOCK)", "").trim();
    }

    // Group lines to statements
    private static void groupLines(String line) {

        if (joiner == null) {
            if (line == null) return;

            int pos = line.toLowerCase().indexOf("from");
            if (pos > 0) {
                // make sure it is not a sub-query
                if (line.toLowerCase().indexOf("from (select") > 0) return;

                // Save the previous statement
                joiner = new StringJoiner(" ");
                joiner.add(line.substring(pos));
            }
        } else {
            if (line.isEmpty()) return;
            if (line.toLowerCase().startsWith("select")) {
                try {
                    queue.put(String.format("SELECT * %s", joiner.toString()));

                    int pos = line.toLowerCase().indexOf("from");
                    if (pos > 0) {
                        // make sure it is not a sub-query
                        if (line.toLowerCase().indexOf("from (select") > 0) return;

                        // Save the previous statement
                        joiner = new StringJoiner(" ");
                        joiner.add(line.substring(pos));
                    } else {
                        joiner = null;
                    }
                } catch (InterruptedException ex) {
                    logger.error("Interrupted during put", ex);
                }
            } else {
                joiner.add(line);
            }
        }
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
                    String statement = queue.poll(3, TimeUnit.SECONDS);
                    if (statement == null) {
                        System.out.println("queue has no items");
                        hasItems = false;
                    } else {
                        final int number = counter++;
                        executor.submit(() -> {
                            this.processStatement(statement, number);
                        });
                        //System.out.println(statement);
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
    private void processStatement(String stat, int number) {

        try {
            if (stat.isEmpty()) return;

            System.out.println(String.format("Thread %d: (%d): %s", Thread.currentThread().getId(), number, stat));

            plsqlLexer lexer = new plsqlLexer(new ANTLRInputStream(stat));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            plsqlParser parser = new plsqlParser(tokens);
            AntlrJoinListener listener = new AntlrJoinListener(stat, number);
            parser.addParseListener(listener);
            parser.addErrorListener(new AntlrErrorListener());
            parser.compilation_unit();

        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }

    /**
     * Write the output to the files
     */
    private void writeOutput() {
        Path out = Paths.get(Application.OUTPUT_FILE);
        Path err = Paths.get(Application.ERROR_FILE);

        try {
            try (BufferedWriter outWriter = Files.newBufferedWriter(out);
                 BufferedWriter errWriter = Files.newBufferedWriter(err)) {
                for (CompoundJoinEntity cje : Application.getModel().getJoins().values()) {

                    if (cje.hasError()) {
                        errWriter.write(cje.getError());
                        errWriter.newLine();
                    } else {
                        outWriter.write(cje.getText(Application.TENANT_NAME, Application.DATABASE_NAME));
                        outWriter.newLine();
                    }
                }
            }
        } catch (Exception ex) {
            logger.error("Error writing output: " + ex.getMessage());
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
