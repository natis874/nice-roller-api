package com.app.nice_roller.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Roller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String modèle;
    private String taille;
    private Boolean disponibilité;
    private String état;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModèle() {
        return modèle;
    }

    public void setModèle(String modèle) {
        this.modèle = modèle;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public Boolean getDisponibilité() {
        return disponibilité;
    }

    public void setDisponibilité(Boolean disponibilité) {
        this.disponibilité = disponibilité;
    }

    public String getÉtat() {
        return état;
    }

    public void setÉtat(String état) {
        this.état = état;
    }
}
