package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.Pais;

public interface IPaisService {
    List<Pais> findAll();
    Pais save(Pais pais);
    Pais update(Pais pais);
    void deleteById(Long id);
}
