package com.app.nice_roller.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class PaiementDTO {

    private Long id;
    private Long locationId;
    private LocalDate datePaiement;
    private double montant;

}
