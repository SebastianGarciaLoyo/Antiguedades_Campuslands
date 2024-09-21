package com.campusland.proyecto.application.services;


import java.util.List;
import com.campusland.proyecto.domain.entity.TipoDireccion;

public interface ITipoDireccionService {
    List<TipoDireccion> findAll();
    TipoDireccion save(TipoDireccion tipoDireccion);
    TipoDireccion update(TipoDireccion tipoDireccion);
    void deleteById(Long id);
}
