package com.app.nice_roller.repository;

import com.app.nice_roller.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client,Long> {
    Client findByEmail(String email);
}
