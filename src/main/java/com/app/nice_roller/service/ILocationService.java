package com.app.nice_roller.service;

import com.app.nice_roller.dto.LocationDTO;

import java.util.List;

public interface ILocationService {

    // Méthode pour obtenir toutes les locations
    List<LocationDTO> getAllLocations();

    // Méthode pour obtenir une location par son ID
    LocationDTO getLocationById(Long id);

    // Méthode pour ajouter une nouvelle location
    LocationDTO createLocation(LocationDTO locationDTO);

    // Méthode pour mettre à jour une location existante
    LocationDTO updateLocation(Long id, LocationDTO locationDTO);

    // Méthode pour supprimer une location par son ID
    void deleteLocation(Long id);
}
