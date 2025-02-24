package com.app.nice_roller.exception;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(Long id) {
        super("Client with ID " + id + " not found.");
    }
}
