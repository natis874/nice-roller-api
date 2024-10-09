package com.app.nice_roller.service;

import com.app.nice_roller.dto.RollerDTO;

import java.util.List;

public interface IRollerService {
    List<RollerDTO> getAllRollers();
    RollerDTO getRollerById(Long id);
    RollerDTO saveRoller(RollerDTO rollerDTO);
    void deleteRoller(Long id);
    List<RollerDTO> getAvailableRollers();
}
