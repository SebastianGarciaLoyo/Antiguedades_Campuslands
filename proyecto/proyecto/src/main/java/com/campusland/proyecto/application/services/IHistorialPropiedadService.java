package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.HistorialPropiedad;

public interface IHistorialPropiedadService {
    List<HistorialPropiedad> findAll();
    HistorialPropiedad save(HistorialPropiedad historialPropiedad);
    HistorialPropiedad update(HistorialPropiedad historialPropiedad);
    void deleteById(Long id);
}
