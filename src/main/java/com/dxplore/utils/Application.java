/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

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

	// Application Singleton 
	private static Application instance = null;
	public static Application getInstance() { return instance; }

	// PRIVATE
	private Path fFilePath;
	private final static Charset ENCODING = StandardCharsets.UTF_8;

	/**
	 * Default constructor
	 */
	public Application() { 		
		// Set singleton
		Application.instance = this;
	}
	
	/**
	 * Read and Process the sql log file
	 */
	public void processFile() {
		
		try {
			logger.info("Starting SQL processing");
			
			// Mark start time
			long start = System.currentTimeMillis();

			// Parse the file line by line
			this.fFilePath = Paths.get(Application.INPUT_FILE);
			this.processLineByLine();

			// Mark end time
			long end = System.currentTimeMillis();
			


			logger.info(String.format("file process completed within %d milliseconds.", (end-start)));

		} catch(Exception ex) {
			logger.error("Error running the application", ex);
		}
	}


	/**
	 * Process the file line by line
	 * @throws IOException
	 */
	private void processLineByLine() throws IOException {
		String prev = "";
		try (Scanner scanner =  new Scanner(this.fFilePath, ENCODING.name())){
			while (scanner.hasNextLine()) {
				prev = buildStatement(scanner.nextLine().toLowerCase().trim(), prev);
			}
			// Process the last statement
			this.processStatement(prev);
		}
	}

	/**
	 * Build complete SQL statements from lines
	 * @param line
	 * @param prev
	 * @return
	 */
	private String buildStatement(String line, String prev) {
		if (line.startsWith("select ")) {
			this.processStatement(prev);
			return line;
		} else {
			return String.format("%s %s", prev, line).trim();
		}
	}


	/**
	 * Process full SQL statement
	 * @param stat
	 */
	private void processStatement(String stat) {
		logger.info(stat);
	}
	
	/**
	 * If input file provided, override default
	 * @param src
	 */
	public void overrideInputFile(String src) {
		if ((src != null) && (!src.isEmpty())) {
			Application.INPUT_FILE = src;
		}
	}
	
	/**
	 * If output file provided, override default
	 * @param src
	 */
	public void overrideOutputFile(String src) {
		if ((src != null) && (!src.isEmpty())) {
			Application.OUTPUT_FILE = src;
		}
	}


	/**
	 * Get folder path and remove backslash suffix if needed
	 * @param value
	 * @return
	 */
	private String getFolderPath(String value) {
		try {
			return value.endsWith("/") ? value.substring(0, value.length() - 1) : value;
		} catch (Exception ex) {
			return value;
		}
	}


}
