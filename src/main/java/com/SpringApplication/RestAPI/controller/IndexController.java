package com.SpringApplication.RestAPI.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringApplication.RestAPI.helpers.SpringLoggingHelper;



@Controller
public class IndexController {
	//mapping to thymeleaf page
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/")
    String index(){
    	
    	 logger.debug("This is a debug message");
         logger.info("This is an info message");
         logger.warn("This is a warn message");
         logger.error("This is an error message");
         
         new SpringLoggingHelper().helpMethod();
         
         
        return "index";
    }
    	
}

