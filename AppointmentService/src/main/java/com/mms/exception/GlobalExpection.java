package com.mms.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExpection {
	
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> recordNotFoundException(RecordNotFoundException ex, WebRequest request){
		LocalDateTime timeStampTime = LocalDateTime.now();
		int status= HttpStatus.NOT_FOUND.value();
		String error=HttpStatus.NOT_FOUND.toString();
		
		ErrorDetails errorDetails=new ErrorDetails(timeStampTime, status, error, ex.getMessage(), request.getContextPath());
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}

}
