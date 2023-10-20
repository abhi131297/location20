package com.location.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LocationExceptionController {
	
	@ExceptionHandler(value = LocationNotFound.class)
	public ResponseEntity<Object> exception(LocationNotFound exception){
		return new ResponseEntity<>("Location not found",HttpStatus.NOT_FOUND);
	}

}
