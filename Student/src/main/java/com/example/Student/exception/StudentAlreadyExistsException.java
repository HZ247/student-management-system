package com.example.Student.exception;

public class StudentAlreadyExistsException extends RuntimeException {
    public StudentAlreadyExistsException(String message) {
            super(message);
    }
}
