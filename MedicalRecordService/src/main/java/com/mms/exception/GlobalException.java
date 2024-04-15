package com.mms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException extends RuntimeException {
	
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<Object> handlerRecordNotFoundException(Exception ex){
		// Exception response Custome Class
		
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
