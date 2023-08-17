package com.restapi.first.Exception;

public class ValidationException extends RuntimeException{

	public ValidationException() {}
	
	public ValidationException(String message) {
		super(message);
	}
}
