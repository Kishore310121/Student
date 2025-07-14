package com.demo.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalException {
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> getcus(IdNotFoundException e){
		return new ResponseEntity<Object> (e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<Object> getcus(AgeNotFoundException e){
		return new ResponseEntity<Object> (e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
	}
}