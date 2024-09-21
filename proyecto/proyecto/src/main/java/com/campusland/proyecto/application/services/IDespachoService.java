package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.Despacho;

public interface IDespachoService {
    List<Despacho> findAll();
    Despacho save(Despacho despacho);
    Despacho update(Despacho despacho);
    void deleteById(Long id);
}
