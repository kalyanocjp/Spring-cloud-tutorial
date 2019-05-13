package com.example.ui.controller;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.ui.model.exception.ErrorMessage;
import com.example.ui.model.exception.UserServiceException;

@ControllerAdvice
public class UserExecptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleAnyException (Exception e, WebRequest request) {
		
		ErrorMessage errorMsg = new ErrorMessage(e.getLocalizedMessage(),new Date());
		
		return new ResponseEntity<Object>( errorMsg, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = {UserServiceException.class})
	public ResponseEntity<Object> handleUserServiceException (UserServiceException e, WebRequest request) {
		
		ErrorMessage errorMsg = new ErrorMessage(e.getLocalizedMessage(),new Date());
		
		return new ResponseEntity<Object>( errorMsg, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
