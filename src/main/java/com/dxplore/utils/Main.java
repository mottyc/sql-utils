/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.utils;


import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The main entry point
 * @author mottyc
 *
 */
public class Main {

	// Logger
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	/**
	 * Main entry point
	 * @param args
	 * @throws IOException
	 */
	public static void main( String[] args ) throws IOException {

        Options options = new Options();
        
        options.addOption("h", "help", false, "Prints help message");
        options.addOption("p", "parse", false, "Process the file to detect joins");
        options.addOption("i", "input", true, "Input sql log file path");
		options.addOption("w", "workers", true, "Number of worker threads, default is 4");
        options.addOption("t", "tenant", true, "Tenant name, default is null");
		options.addOption("d", "database", true, "Database name, default is null");

        /**
         * CLI Parser
         */
        try {
	        CommandLineParser parser = new DefaultParser();
	        CommandLine line = parser.parse(options, args);
	        
	        Application app = new Application();

	        if (line.hasOption("i")) { app.overrideInputFile(line.getOptionValue("i")); }
			if (line.hasOption("w")) { app.overrideWorkers(line.getOptionValue("w")); }
			if (line.hasOption("t")) { app.overrideTenant(line.getOptionValue("t")); }
			if (line.hasOption("d")) { app.overrideDatabase(line.getOptionValue("d")); }


			// Handle errors
			if (line.hasOption("i") == false) {
				showError("Input file not defined");
				return;
			}
			// Handle errors
			if (line.hasOption("p") == false) {
				showError("Command not defined");
				return;
			}

	        // Process help
	        if (line.hasOption("h")) {
	        	showBanner(options.getOption("h"));
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("SQL join parser", options);
                return;
            } 
	        
	        // Process file
	        if (line.hasOption("p")) {
	        	showBanner(options.getOption("p"));
	        	app.processFile();
	        	return;
	        }

			// Show help
			throw new UnrecognizedOptionException("Command not specified");


        } catch (UnrecognizedOptionException ex){
        	showBanner(options.getOption("h"));
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("SQL Parser", options);
            return;
        } catch (Exception ex) {
        	logger.error("SQL Parser failed", ex);
        }
	}
	
	/**
	 * Show banner according to option
	 * @param option
	 */
	private static void showBanner(Option option) {
		try {
			System.out.println();
			System.out.println("======================================================");
			System.out.println("==  dxplore.io SQL utils package, join-parser V 2.1"   );
			System.out.println("==  " + option.getDescription());
			System.out.println("======================================================");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Show bsample command
	 */
	private static void showError(String error) {
		try {
			System.out.println();
			System.out.println("ERROR: " + error);
			System.out.println();
			System.out.println("Usage sample:");
			System.out.println("java -jar ./join-parset-<version>.jar -i <input_file> -t <tenant> -d <database> -w <num_of_workers> -p"   );
			System.out.println();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
