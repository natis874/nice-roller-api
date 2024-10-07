package com.app.nice_roller.controller;

import com.app.nice_roller.dto.RollerDTO;
import com.app.nice_roller.service.IRollerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rollers")
public class RollerController {
    @Autowired
    private IRollerService rollerService;

    @GetMapping
    public ResponseEntity<List<RollerDTO>> getAllRollers() {
        return ResponseEntity.ok(rollerService.getAllRollers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RollerDTO> getRollerById(@PathVariable Long id) {
        return ResponseEntity.ok(rollerService.getRollerById(id));
    }

    @PostMapping
    public ResponseEntity<RollerDTO> createRoller(@RequestBody RollerDTO rollerDTO) {
        return ResponseEntity.ok(rollerService.saveRoller(rollerDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoller(@PathVariable Long id) {
        rollerService.deleteRoller(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/available")
    public ResponseEntity<List<RollerDTO>> getAvailableRollers() {
        return ResponseEntity.ok(rollerService.getAvailableRollers());
    }
}
