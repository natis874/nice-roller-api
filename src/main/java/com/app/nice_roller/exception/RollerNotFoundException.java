package com.app.nice_roller.exception;

public class RollerNotFoundException extends RuntimeException{

    public RollerNotFoundException(Long id) { super("Roller with ID " + id + " not found.");
    }
}
