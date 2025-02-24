package com.app.nice_roller.service.impl;

import com.app.nice_roller.dto.PaiementDTO;
import com.app.nice_roller.entities.Paiement;
import com.app.nice_roller.exception.PaiementNotFoundException;
import com.app.nice_roller.mapper.PaiementMapper;
import com.app.nice_roller.repository.IPaiementRepository;
import com.app.nice_roller.service.IPaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IPaiementServiceImpl implements IPaiementService {

    @Autowired
    private IPaiementRepository paiementRepository;

    @Autowired
    private PaiementMapper paiementMapper;

    @Override
    public List<PaiementDTO> getAllPaiements() {
        return paiementRepository.findAll().stream().map(paiementMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public PaiementDTO getPaiementById(Long id) {
        return paiementRepository.findById(id)
                .map(paiementMapper::toDTO)
                .orElseThrow(()-> new PaiementNotFoundException(id));
    }

    @Override
    public PaiementDTO savePaiement(PaiementDTO paiementdto) {
        Paiement paiement = paiementMapper.toEntity(paiementdto);
        Paiement savedPaiement = paiementRepository.save(paiement);
        return paiementMapper.toDTO(savedPaiement);
    }

    @Override
    public void deletePaiement(Long id) {
        if (!paiementRepository.existsById(id)){
            throw new PaiementNotFoundException(id);
        }
        paiementRepository.deleteById(id);
    }

    @Override
    public List<PaiementDTO> getPaiementsByDate(LocalDate datePaiement) {
        return paiementRepository.findByDatePaiement(datePaiement).stream().map(paiementMapper::toDTO)
                .collect(Collectors.toList());
    }
}
