package com.app.nice_roller.service;

import com.app.nice_roller.dto.RollerDTO;
import com.app.nice_roller.entities.Roller;
import com.app.nice_roller.exception.RollerNotFoundException;
import com.app.nice_roller.mapper.RollerMapper;
import com.app.nice_roller.repository.IRollerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class IRollerServiceImpl implements IRollerService {

    @Autowired
    private IRollerRepository rollerRepository;

    @Autowired
    private RollerMapper rollerMapper;


    @Override
    public List<RollerDTO> getAllRollers() {
        return rollerRepository.findAll().stream()
                .map(rollerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RollerDTO getRollerById(Long id) {
        return rollerRepository.findById(id)
                .map(rollerMapper::toDTO)
                .orElseThrow(() -> new RollerNotFoundException(id));
    }

    @Override
    public RollerDTO saveRoller(RollerDTO rollerDTO) {
        Roller roller = rollerMapper.toEntity(rollerDTO);
        Roller savedRoller = rollerRepository.save(roller);
        return rollerMapper.toDTO(savedRoller);
    }

    @Override
    public void deleteRoller(Long id) {
            rollerRepository.deleteById(id);
    }

    @Override
    public List<RollerDTO> getAvailableRollers() {
        return rollerRepository.findByDisponibiliteTrue().stream()
                .map(rollerMapper::toDTO)
                .collect(Collectors.toList());
    }
}
