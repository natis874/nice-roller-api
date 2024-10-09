package com.app.nice_roller.mapper;

import com.app.nice_roller.dto.ClientDTO;
import com.app.nice_roller.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ClientMapper {

    ClientDTO toDTO(Client client);

    Client toEntity(ClientDTO clientDTO);

}
