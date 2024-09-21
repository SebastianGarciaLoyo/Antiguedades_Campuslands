package com.campusland.proyecto.application.services;


import java.util.List;
import com.campusland.proyecto.domain.entity.Genero;

public interface IGeneroService {
    List<Genero> findAll();
    Genero save(Genero genero);
    Genero update(Genero genero);
    void deleteById(Long id);
}

