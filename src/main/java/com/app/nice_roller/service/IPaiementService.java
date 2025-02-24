package com.app.nice_roller.service;

import com.app.nice_roller.dto.PaiementDTO;

import java.time.LocalDate;
import java.util.List;

public interface IPaiementService {

    List<PaiementDTO> getAllPaiements();
    PaiementDTO getPaiementById(Long id);
    PaiementDTO savePaiement(PaiementDTO paiementdto);
    void deletePaiement(Long id);
    List<PaiementDTO> getPaiementsByDate(LocalDate datePaiement);
}
