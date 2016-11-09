/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.utils;

import com.dxplore.model.CompoundJoinEntity;
import com.dxplore.plsql.plsqlLexer;
import com.dxplore.plsql.plsqlParser;
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
public class ParallelFileProcessor {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(ParallelFileProcessor.class);

    private boolean isProcessing = true;

    public void process() {
        try {

            // Mark start time
            long start = System.currentTimeMillis();

            Path path = Paths.get(Application.INPUT_FILE);
            String prev = "";
            int lineNum = 0;

            // Build and start thread pool for statement processing
            ExecutorService executor = Executors.newFixedThreadPool(Application.WORKERS);
            this.startProcessStatements(executor);

            // Start output files writer thread
            Thread writer = this.startWriteJoins();

            // Parse the file line by line withStream API
            Stream<String> lines = Files.lines(path);
            lines.map(ParallelFileProcessor::removeSpecialChars).map(ParallelFileProcessor::removeComments).forEach(ParallelFileProcessor::groupLines);

            this.isProcessing = false;
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.HOURS);

            // Wait for the writer to finish
            writer.join();

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

    private static BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10000);
    private static StringJoiner joiner = null;

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
                } catch (InterruptedException ex) {
                    logger.error("Interrupted during put", ex);
                }
                joiner = null;
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
                while (this.isProcessing) {
                    while (!queue.isEmpty()) {
                        String statement = queue.poll(3, TimeUnit.SECONDS);
                        if (statement == null) {
                            System.out.println("Null item in queue");
                        } else {
                            final int number = counter++;
                            executor.submit(() -> {
                                this.processStatement(statement, number);
                            });
                            System.out.println(statement);
                        }
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
    private Thread startWriteJoins() {

        Thread writer = new Thread(() -> {
            Path out = Paths.get(Application.OUTPUT_FILE);
            Path err = Paths.get(Application.ERROR_FILE);

            try {
                try (BufferedWriter outWriter = Files.newBufferedWriter(out);
                     BufferedWriter errWriter = Files.newBufferedWriter(err)) {

                    while (this.isProcessing) {
                        while (Application.getModel().hasItemsInQueue()) {
                            CompoundJoinEntity cje = Application.getModel().pullCompoundJoin(1, TimeUnit.SECONDS);
                            if (cje != null) {
                                if (cje.hasError()) {
                                    errWriter.write(cje.getError());
                                    errWriter.newLine();
                                } else {
                                    outWriter.write(cje.getText(Application.TENANT_NAME, Application.DATABASE_NAME));
                                    outWriter.newLine();
                                }
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                logger.error("Error writing output: " + ex.getMessage());
            }
        });
        writer.start();
        return writer;
    }

}
