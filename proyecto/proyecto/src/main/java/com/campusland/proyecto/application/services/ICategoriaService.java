package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.Categoria;

public interface ICategoriaService {
    List<Categoria> findAll();
    Categoria save(Categoria categoria);
    Categoria update(Categoria categoria);
    void deleteById(Long id);
}

