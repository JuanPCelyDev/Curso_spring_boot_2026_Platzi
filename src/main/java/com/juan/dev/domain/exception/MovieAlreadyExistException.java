package com.juan.dev.domain.exception;

public class MovieAlreadyExistException extends RuntimeException {
    public MovieAlreadyExistException(String movieTitle) {
        super("La película con título '" + movieTitle + "' ya existe en la base de datos.");
    }
}
