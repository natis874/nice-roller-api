package com.app.nice_roller.service;

import com.app.nice_roller.dto.ClientDTO;

import java.util.List;

public interface IClientService {


    // Méthode pour obtenir tous les clients
    List<ClientDTO> getAllClients();

    // Méthode pour obtenir un client par son ID
    ClientDTO getClientById(Long id);

    // Méthode pour ajouter un nouveau client
    ClientDTO createClient(ClientDTO clientDTO);

    // Méthode pour mettre à jour un client existant
    ClientDTO updateClient(Long id, ClientDTO clientDTO);

    // Méthode pour supprimer un client par son ID
    void deleteClient(Long id);
}
