package com.SpringApplication.RestAPI.controller;

import java.text.DecimalFormat;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {
/*
 * This is the class that handles 
 * 
 * request coming from client  */ 
	DecimalFormat df = new DecimalFormat("###00.####");
	
	/*Addition calculations
	 * 
	 * http://localhost:8080/add?a=7&b=5
	 * 
	 *Assign a = first no. and b = second no.*/
	@GetMapping(value="/add")
	@ResponseBody
	public ResponseEntity<String> add(@RequestParam (value="a") double a,@RequestParam (value="b") double b){
		
		
        double sum = a+b;
		System.out.println(df.format(sum));
		
		HttpHeaders headers =new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON); //Accept:application/json
		 
		 //setStatusCode to 200
		return new ResponseEntity<String>("results :"+sum, headers,HttpStatus.OK);
				
	}
	
	/*Subtraction calculations 
	 * 
	 * http://localhost:8080/subtract?a=7&b=5
	 * 
	 * Assign a = first no. and b = second no.*/
	@GetMapping(value="/subtract")
	@ResponseBody
	public ResponseEntity<String> subtract(@RequestParam (value="a") double a,@RequestParam (value="b") double b){
		
		double sum = a-b;
		System.out.println(df.format(sum)); 
		
		HttpHeaders headers =new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		
		return new ResponseEntity<String>("results :"+sum, headers,HttpStatus.OK);
	}
	
	/*Multiplication calculations 
	 * 
	 * http://localhost:8080/multiply?a=7&b=5
	 * 
	 *Assign a = first no. and b = second no.*/
	@GetMapping(value="/multiply")
	@ResponseBody
	public ResponseEntity<String> multiply(@RequestParam (value="a") double a, @RequestParam (value="b") double b){
		
		double sum = a * b;
		System.out.println(df.format(sum)); 
		
		HttpHeaders headers =new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		
		return new ResponseEntity<String>("results :"+sum, headers,HttpStatus.OK);
	}
	/*Division calculations 
	 * 
	 * http://localhost:8080/divide?a=7&b=5
	 * 
	 *Assign a = first no. and b = second no.*/
	@GetMapping(value="/divide")
	@ResponseBody
	public ResponseEntity<String> divide(@RequestParam (value="a") double a, @RequestParam (value="a") double b){
		
		double sum = a / b;
		System.out.println(df.format(sum)); 
		
		HttpHeaders headers =new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		
		return new ResponseEntity<String>("results :"+sum, headers,HttpStatus.OK);
	}

	

}
