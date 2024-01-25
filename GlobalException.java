package com.hefshine.crud.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<?> nullExceptionHandler(NullPointerException ex){
		return new  ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

	}
	

	
//	@ExceptionHandler(StudentNotFountException.class)
//	public ResponseEntity<?> studentNotfoundHandler(StudentNotFountException ex)
//	{
//		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
//	}
//	
//	

}
