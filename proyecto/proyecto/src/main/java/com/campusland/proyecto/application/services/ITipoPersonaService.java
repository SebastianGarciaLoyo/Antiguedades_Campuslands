package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.TipoPersona;

public interface ITipoPersonaService {
    List<TipoPersona> findAll();
    TipoPersona save(TipoPersona tipoPersona);
    TipoPersona update(TipoPersona tipoPersona);
    void deleteById(Long id);
}

