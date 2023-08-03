package com.example.project.exception;

import java.util.Map;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AppNotFoundAdvice {

	
@ResponseBody	
	@ExceptionHandler(AppNotFoundException.class)
@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String,String> exceptionHandler(AppNotFoundException exception)
	{
		Map<String,String> errorMap=new HashMap<>();
		errorMap.put("errorMessage",exception.getMessage());
		return errorMap;
	}
}
