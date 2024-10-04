package com.app.nice_roller.repository;

import com.app.nice_roller.entities.Roller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRollerRepository extends JpaRepository<Roller,Long> {
    List<Roller> fingByDisponibilitéTrue();
}
