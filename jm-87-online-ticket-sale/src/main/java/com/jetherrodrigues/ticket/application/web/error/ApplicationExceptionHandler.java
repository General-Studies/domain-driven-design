package com.jetherrodrigues.ticket.application.web.error;

import com.jetherrodrigues.ticket.domain.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.Serializable;

@RestControllerAdvice
public final class ApplicationExceptionHandler implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final String NOT_FOUND_ERROR = "NOT_FOUND_ERROR";

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleGenericNotFoundException(final NotFoundException e) {
        return new ResponseEntity<>(ErrorResponse.of(
                NOT_FOUND_ERROR, e.getMessage(),
                HttpStatus.NOT_FOUND.value()),
                HttpStatus.NOT_FOUND);
    }
}
