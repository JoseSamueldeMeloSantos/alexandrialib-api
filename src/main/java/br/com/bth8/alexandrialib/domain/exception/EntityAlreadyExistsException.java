package br.com.bth8.alexandrialib.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EntityAlreadyExistsException extends Exception{

	public EntityAlreadyExistsException() {
		super("EntitAlreadyExistsException");
	}

	public EntityAlreadyExistsException(String message) {
		super(message);
	}
}
