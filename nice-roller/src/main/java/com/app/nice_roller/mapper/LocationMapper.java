package com.app.nice_roller.mapper;

import com.app.nice_roller.dto.LocationDTO;
import com.app.nice_roller.entities.Location;
import org.mapstruct.Mapper;

@Mapper
public interface LocationMapper {
    LocationDTO toDTO(Location location);

    Location toEntity(LocationDTO locationDTO);
}
