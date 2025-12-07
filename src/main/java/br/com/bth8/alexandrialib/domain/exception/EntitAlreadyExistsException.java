package br.com.bth8.alexandrialib.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EntitAlreadyExistsException extends Exception{

	public EntitAlreadyExistsException() {
		super("EntitAlreadyExistsException");
	}

	public EntitAlreadyExistsException(String message) {
		super(message);
	}
}
