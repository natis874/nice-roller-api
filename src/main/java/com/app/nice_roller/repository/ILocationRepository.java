package com.app.nice_roller.repository;

import com.app.nice_roller.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILocationRepository extends JpaRepository<Location,Long> {
    List<Location> findByClientId(Long clientId);
}
