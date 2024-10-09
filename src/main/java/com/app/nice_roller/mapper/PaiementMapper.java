package com.app.nice_roller.mapper;

import com.app.nice_roller.dto.PaiementDTO;
import com.app.nice_roller.entities.Paiement;
import org.mapstruct.Mapper;

@Mapper
public interface PaiementMapper {

    PaiementDTO toDTO(Paiement paiement);

    Paiement toEntity(PaiementDTO paiementDTO);
}
