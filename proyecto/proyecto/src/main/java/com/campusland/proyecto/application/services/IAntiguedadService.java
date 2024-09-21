package com.campusland.proyecto.application.services;

import java.util.List;

import com.campusland.proyecto.domain.entity.Antiguedad;

public interface IAntiguedadService {
    List<Antiguedad> findAll();
    Antiguedad save(Antiguedad antiguedad);
    Antiguedad update(Antiguedad antiguedad);
    void deleteById(Long id);
}

