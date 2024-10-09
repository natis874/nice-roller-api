package com.app.nice_roller.mapper;

import com.app.nice_roller.dto.RollerDTO;
import com.app.nice_roller.entities.Roller;
import org.mapstruct.Mapper;

@Mapper
public interface RollerMapper {
    RollerDTO toDTO(Roller roller);
    Roller toEntity(RollerDTO rollerDTO);
}
