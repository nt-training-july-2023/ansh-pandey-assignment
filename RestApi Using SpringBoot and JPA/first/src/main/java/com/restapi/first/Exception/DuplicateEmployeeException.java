package com.restapi.first.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DuplicateEmployeeException extends RuntimeException {
	public DuplicateEmployeeException(String s) {
		super(s);

	}
}
