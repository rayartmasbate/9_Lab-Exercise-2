package com.example.csit321g3.exception;

public class NameNotFoundException extends RuntimeException {
    public NameNotFoundException(String message) {
        super(message);
    }
}