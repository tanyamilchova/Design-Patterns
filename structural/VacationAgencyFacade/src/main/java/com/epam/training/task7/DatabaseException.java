package com.epam.training.task7;

public class DatabaseException extends RuntimeException{
    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
