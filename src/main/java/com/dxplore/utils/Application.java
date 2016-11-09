/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.utils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Stream;

import com.dxplore.model.CompoundJoinEntity;
import com.dxplore.model.StatementEntity;
import com.dxplore.plsql.plsqlLexer;
import com.dxplore.plsql.plsqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import org.apache.commons.io.input.ReaderInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The main application for file processing
 *
 * @author mottyc
 *
 */
public class Application {

	// Logger
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	// Input pending tar files queue
	public static LinkedBlockingQueue<String> tarFilesQueue = new LinkedBlockingQueue<String>();
	
	// Configuration constants
	public static String INPUT_FILE = "";
	public static String OUTPUT_FILE = "";
	public static String ERROR_FILE = "";

	public static String TENANT_NAME = "";
	public static String DATABASE_NAME = "";

	public static int WORKERS = 4;

	// Application Singleton 
	private static Application instance = null;
	public static Application getInstance() { return instance; }

	// Model manager Singleton
	private static ModelManager model = null;
	public static ModelManager getModel() { return model; }

	// Statements counter
	private int counter = 0;

	// Encoding
	private final static Charset ENCODING = StandardCharsets.UTF_8;

	/**
	 * Default constructor
	 */
	public Application() { 		
		// Set singletons
		Application.instance = this;
		Application.model = new ModelManager();
	}

	/**
	 * Read and process the SQL in a string
	 */
	public void processString(String sql) {
		try (BufferedWriter outWriter = new BufferedWriter(new OutputStreamWriter(System.out));
			 BufferedWriter errWriter = new BufferedWriter(new OutputStreamWriter(System.err))) {

			// Process string
			FileProcessor processor = new FileProcessor();
			processor.processStatement(sql, 1);

			// Write output
			//this.writeOutput(outWriter, errWriter);

		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}

	}

	/**
	 * Read and Process the SQL in a log file
	 */
	public void processFile() {
		FileProcessor processor = new FileProcessor();
		processor.process();

		Path out = Paths.get(Application.OUTPUT_FILE);
		Path err = Paths.get(Application.ERROR_FILE);

		try {
			try (BufferedWriter outWriter = Files.newBufferedWriter(out);
				 BufferedWriter errWriter = Files.newBufferedWriter(err)) {

				// Write output
				this.writeOutput(outWriter, errWriter);
			}
		} catch (Exception ex) {
			logger.error("Error writing output: " + ex.getMessage());
		}
	}



	/**
	 * Write the output to the streams
	 */
	private void writeOutput(BufferedWriter outWriter, BufferedWriter errWriter) {
		try {
			for (CompoundJoinEntity cje : this.getModel().getJoins().values()) {

				if (cje.hasError()) {
					errWriter.write(cje.getError());
					errWriter.newLine();
				} else {
					outWriter.write(cje.getText(Application.TENANT_NAME, Application.DATABASE_NAME));
					outWriter.newLine();
				}
			}
		} catch (Exception ex) {
			logger.error("Error writing output: " + ex.getMessage());
		}
	}

	/**
	 * If input file provided (-i), override default value
	 * @param value Provided value
	 */
	public void overrideInputFile(String value) {
		if ((value != null) && (!value.isEmpty())) {
			Application.INPUT_FILE = value;
			Application.OUTPUT_FILE = String.format("%s.joins", value);
			Application.ERROR_FILE = String.format("%s.err", value);
		}
	}

	/**
	 * If tenant name is provided (-t), override default value
	 * @param value Provided value
	 */
	public void overrideTenant(String value) {
		Application.TENANT_NAME = value;
	}

	/**
	 * If database name is provided (-d), override default value
	 * @param value Provided value
	 */
	public void overrideDatabase(String value) {
		Application.DATABASE_NAME = value;
	}

	/**
	 * If number of workers is provided (-w), override default value
	 * @param value
	 */
	public void overrideWorkers(String value) {
		int workers = Integer.parseInt(value);
		Application.WORKERS = workers;
	}
}
