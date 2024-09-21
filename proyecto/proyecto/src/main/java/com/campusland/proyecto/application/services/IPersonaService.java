package com.campusland.proyecto.application.services;


import java.util.List;
import com.campusland.proyecto.domain.entity.Persona;

public interface IPersonaService {
    List<Persona> findAll();
    Persona save(Persona persona);
    Persona update(Persona persona);
    void deleteById(Long id);
}

