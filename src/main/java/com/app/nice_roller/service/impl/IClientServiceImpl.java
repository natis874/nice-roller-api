package com.app.nice_roller.service.impl;

import com.app.nice_roller.dto.ClientDTO;
import com.app.nice_roller.entities.Client;
import com.app.nice_roller.exception.ClientNotFoundException;
import com.app.nice_roller.mapper.ClientMapper;
import com.app.nice_roller.repository.IClientRepository;
import com.app.nice_roller.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class IClientServiceImpl implements IClientService {


    @Autowired
    private IClientRepository clientRepository;

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public List<ClientDTO> getAllClients() {
        return clientRepository.findAll().stream()
                .map(clientMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ClientDTO getClientById(Long id) {
        return clientRepository.findById(id)
                .map(clientMapper::toDTO)
                .orElseThrow(() -> new ClientNotFoundException(id));
    }

    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        Client client = clientMapper.toEntity(clientDTO);
        Client savedClient = clientRepository.save(client);
        return clientMapper.toDTO(savedClient);
    }

    @Override
    public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
        return null;
    }

    @Override
    public void deleteClient(Long id) {
        if (!clientRepository.existsById(id)) {
            throw new ClientNotFoundException(id);
        }
        clientRepository.deleteById(id);
    }
}
