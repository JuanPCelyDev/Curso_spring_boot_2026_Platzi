package com.juan.dev.domain.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(Long id) {
        super("La película con ID '" + id + "' no fue encontrada en la base de datos.");
    }
}
