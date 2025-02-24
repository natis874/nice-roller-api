package com.app.nice_roller.service.impl;

import com.app.nice_roller.dto.LocationDTO;
import com.app.nice_roller.entities.Location;
import com.app.nice_roller.exception.LocationNotFoundException;
import com.app.nice_roller.mapper.LocationMapper;
import com.app.nice_roller.repository.ILocationRepository;
import com.app.nice_roller.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ILocationServiceImpl implements ILocationService {

    @Autowired
    private ILocationRepository locationRepository;

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public List<LocationDTO> getAllLocations() {
        return locationRepository.findAll().stream()
                .map(locationMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public LocationDTO getLocationById(Long id) {
        return locationRepository.findById(id)
                .map(locationMapper::toDTO)
                .orElseThrow(() -> new LocationNotFoundException(id));
    }

    @Override
    public LocationDTO createLocation(LocationDTO locationDTO) {
        Location location = locationMapper.toEntity(locationDTO);
        Location savedLocation = locationRepository.save(location);
        return locationMapper.toDTO(savedLocation);
    }

    @Override
    public LocationDTO updateLocation(Long id, LocationDTO locationDTO) {
        return null;
    }

    @Override
    public void deleteLocation(Long id) {locationRepository.deleteById(id);}
}
