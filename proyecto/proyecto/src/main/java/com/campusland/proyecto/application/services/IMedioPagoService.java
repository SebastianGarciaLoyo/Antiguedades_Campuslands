package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.MedioPago;

public interface IMedioPagoService {
    List<MedioPago> findAll();
    MedioPago save(MedioPago medioPago);
    MedioPago update(MedioPago medioPago);
    void deleteById(Long id);
}
