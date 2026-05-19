package com.juan.dev.web.exception;

import com.juan.dev.domain.exception.MovieAlreadyExistException;
import com.juan.dev.domain.exception.MovieNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(MovieAlreadyExistException.class)
    public ResponseEntity<Error> handleException(MovieAlreadyExistException exception) {
        Error error = new Error("Movie-Already-Exist", exception.getMessage());
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<Error> handleException(MovieNotFoundException exception) {
        Error error = new Error("Movie-Not-Found", exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<Error>> handleException(MethodArgumentNotValidException exception) {
        List<Error> errors = new ArrayList<>();
        exception.getBindingResult().getFieldErrors().forEach(fieldError -> {
            Error error = new Error(fieldError.getField(), fieldError.getDefaultMessage());
            errors.add(error);
        });
        return ResponseEntity.badRequest().body(errors);
   }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(Exception exception) {
        Error error = new Error("Unknown-error", exception.getMessage());
        return ResponseEntity.internalServerError().body(error);
   }
}

