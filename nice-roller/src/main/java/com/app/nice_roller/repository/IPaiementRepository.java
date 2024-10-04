package com.app.nice_roller.repository;

import com.app.nice_roller.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IPaiementRepository extends JpaRepository<Paiement,Long> {
    List<Paiement> findByDatePaiement (LocalDate datePaiement);
}
