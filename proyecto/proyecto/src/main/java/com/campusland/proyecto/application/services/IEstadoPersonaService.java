package com.campusland.proyecto.application.services;


import java.util.List;
import com.campusland.proyecto.domain.entity.EstadoPersona;

public interface IEstadoPersonaService {
    List<EstadoPersona> findAll();
    EstadoPersona save(EstadoPersona estadoPersona);
    EstadoPersona update(EstadoPersona estadoPersona);
    void deleteById(Long id);
}
