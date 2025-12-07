package br.com.bth8.alexandrialib.api.exceptionhandler;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.bth8.alexandrialib.domain.exception.EntityAlreadyExistsException;
import br.com.bth8.alexandrialib.domain.exception.EntityNotFoundException;

@RestControllerAdvice
public class ExceptionResponseHandler {

    @ExceptionHandler(EntityAlreadyExistsException.class)
    public final ResponseEntity<ExceptionResponse> handleEntityAlreadyExistsException(
            EntityAlreadyExistsException ex,
            WebRequest request
    ) {
        ExceptionResponse response = new ExceptionResponse(
                LocalDate.now(),
                ex.getMessage(),
                request.getDescription(false)
        );

        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }
    
   @ExceptionHandler(EntityNotFoundException.class)
   public final ResponseEntity<ExceptionResponse> handleEntityNotFoundExcption(
		   EntityNotFoundException ex,
		   WebRequest request
		   ){
	   ExceptionResponse response = new ExceptionResponse(
			   LocalDate.now(),
			   ex.getMessage(),
			   request.getDescription(false));
	   
	   return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
   }
   

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleException(
            Exception ex,
            WebRequest request
    ) {
        ExceptionResponse response = new ExceptionResponse(
                LocalDate.now(),
                ex.getMessage(),
                request.getDescription(false)
        );

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private record ExceptionResponse(
            @JsonFormat(pattern = "dd/MM/yyyy")
            LocalDate timestamp,
            String message,
            String details
    ) {}
}
