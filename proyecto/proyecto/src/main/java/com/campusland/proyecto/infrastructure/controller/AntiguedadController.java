package com.campusland.proyecto.infrastructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusland.proyecto.application.services.IAntiguedadService;
import com.campusland.proyecto.domain.entity.Antiguedad;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/antiguedades")
public class AntiguedadController {

    private final IAntiguedadService antiguedadService;

    @Autowired
    public AntiguedadController(IAntiguedadService antiguedadService) {
        this.antiguedadService = antiguedadService;
    }

    @GetMapping
    public List<Antiguedad> getAllAntiguedades() {
        return antiguedadService.findAll();
    }

    @PostMapping
    public ResponseEntity<Antiguedad> createAntiguedad(@RequestBody Antiguedad antiguedades) {
        Antiguedad savedAntiguedad = antiguedadService.save(antiguedades);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAntiguedad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Antiguedad> updateAntiguedad(@PathVariable Long id, @RequestBody Antiguedad antiguedades) {
        antiguedades.setId(id);
        try {
            Antiguedad updatedAntiguedad = antiguedadService.update(antiguedades);
            return ResponseEntity.ok(updatedAntiguedad);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAntiguedad(@PathVariable Long id) {
        try {
            antiguedadService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
