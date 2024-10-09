package com.app.nice_roller.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class LocationDTO {
    private Long id;
    private Long clientId;
    private Long rollerId;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double prixTotal;
}
