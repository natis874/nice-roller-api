package com.app.nice_roller.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rollers")
public class Roller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String modèle;
    private String taille;
    private Boolean disponibilité;
    private String état;

}
