package com.app.nice_roller.controller;

import com.app.nice_roller.dto.PaiementDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paiements")
public class PaiementController {

    @PostMapping
    public ResponseEntity<String> initiatePayment(@RequestBody PaiementDTO request) {
        // Logique métier ici
        return ResponseEntity.ok("Paiement initié");
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaiementDTO> getPaymentStatus(@PathVariable String id) {
        // Logique métier ici
        return ResponseEntity.ok(new PaiementDTO());
    }

    @PostMapping("/{id}/refund")
    public ResponseEntity<String> processRefund(@PathVariable String id) {
        // Logique métier ici
        return ResponseEntity.ok("Remboursement effectué");
    }
}
