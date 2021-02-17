package com.maiaaraujo5.weather.adapter.in.rest.exception;

import com.maiaaraujo5.weather.adapter.out.weatherService.exception.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalHandlerException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ResponseException> handleNotFoundException(BadRequestException badRequestException) {
        ResponseException responseException = new ResponseException(HttpStatus.BAD_REQUEST.name(), badRequestException.getMessage());
        return new ResponseEntity<>(responseException, HttpStatus.BAD_REQUEST);
    }
}
