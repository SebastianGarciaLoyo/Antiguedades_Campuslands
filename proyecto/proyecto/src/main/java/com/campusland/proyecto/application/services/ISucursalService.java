package com.campusland.proyecto.application.services;


import java.util.List;
import com.campusland.proyecto.domain.entity.Sucursal;

public interface ISucursalService {
    List<Sucursal> findAll();
    Sucursal save(Sucursal sucursal);
    Sucursal update(Sucursal sucursal);
    void deleteById(Long id);
}

