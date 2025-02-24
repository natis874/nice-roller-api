package com.app.nice_roller.exception;

public class PaiementNotFoundException extends RuntimeException {
    public PaiementNotFoundException(Long id) {
        super("Paiement with ID " + id + " not found.");
    }
}
