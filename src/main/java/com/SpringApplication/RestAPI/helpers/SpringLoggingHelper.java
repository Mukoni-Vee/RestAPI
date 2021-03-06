package com.SpringApplication.RestAPI.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringLoggingHelper {
	/*
	 * class used to log messages in the application
	 * 
	 * */
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	    public void helpMethod(){
	    	
	        logger.debug("This is a debug message");
	        logger.info("This is an info message");
	        logger.warn("This is a warn message");
	        logger.error("This is an error message");
	    }
}
