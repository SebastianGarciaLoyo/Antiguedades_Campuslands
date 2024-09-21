package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.Ciudad;

public interface ICiudadService {
    List<Ciudad> findAll();
    Ciudad save(Ciudad ciudad);
    Ciudad update(Ciudad ciudad);
    void deleteById(Long id);
}
