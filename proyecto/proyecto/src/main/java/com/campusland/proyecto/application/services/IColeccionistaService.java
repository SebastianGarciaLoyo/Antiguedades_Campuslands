package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.Coleccionista;

public interface IColeccionistaService {
    List<Coleccionista> findAll();
    Coleccionista save(Coleccionista coleccionista);
    Coleccionista update(Coleccionista coleccionista);
    void deleteById(Long id);
}
