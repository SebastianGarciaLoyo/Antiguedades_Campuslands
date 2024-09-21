package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.Transaccion;

public interface ITransaccionService {
    List<Transaccion> findAll();
    Transaccion save(Transaccion transaccion);
    Transaccion update(Transaccion transaccion);
    void deleteById(Long id);
}
