package com.app.nice_roller.dto;

import lombok.Data;

@Data
public class RollerDTO {
    private Long id;
    private String marque;
    private String taille;
    private boolean disponibilité;
}
