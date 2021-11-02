package com.cogent.springbootrestdemo1.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	//means current method is going to handle
	//resourcenotfoundexception exception
	public ResponseEntity<?> resourceNotFoundException
	(ResourceNotFoundException ex, WebRequest request){
		System.out.println("Exceptino handling for resource");
		ErrorDetails err = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalExceptionHandler
	(Exception ex, WebRequest request){
		ErrorDetails err = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
}
