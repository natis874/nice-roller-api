package com.app.nice_roller.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rollers")
public class Roller extends AbstractAuditingEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String modele;
    private String taille;
    private Boolean disponibilite;
    private String etat;

}
