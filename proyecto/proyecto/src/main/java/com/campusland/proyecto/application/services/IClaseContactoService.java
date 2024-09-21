package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.ClaseContacto;

public interface IClaseContactoService {
    List<ClaseContacto> findAll();
    ClaseContacto save(ClaseContacto claseContacto);
    ClaseContacto update(ClaseContacto claseContacto);
    void deleteById(Long id);
}

