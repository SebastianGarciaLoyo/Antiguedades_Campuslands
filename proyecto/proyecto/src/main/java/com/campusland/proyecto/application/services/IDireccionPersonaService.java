package com.campusland.proyecto.application.services;


import java.util.List;
import com.campusland.proyecto.domain.entity.DireccionPersona;

public interface IDireccionPersonaService {
    List<DireccionPersona> findAll();
    DireccionPersona save(DireccionPersona direccionPersona);
    DireccionPersona update(DireccionPersona direccionPersona);
    void deleteById(Long id);
}

