package br.com.bth8.alexandrialib.api.dto.response;

import java.time.LocalDate;

public record ExceptionResponse (
		LocalDate timestamp,
        String message,
        String details
		) {

}
