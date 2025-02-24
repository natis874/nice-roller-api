package com.app.nice_roller.exception;

public class LocationNotFoundException extends RuntimeException{
    public LocationNotFoundException(Long id) {super("Location with ID " + id + " not found."); }}
