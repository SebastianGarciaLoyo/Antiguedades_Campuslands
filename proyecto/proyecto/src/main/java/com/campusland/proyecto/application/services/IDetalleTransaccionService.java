package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.DetalleTransaccion;

public interface IDetalleTransaccionService {
    List<DetalleTransaccion> findAll();
    DetalleTransaccion save(DetalleTransaccion detalleTransaccion);
    DetalleTransaccion update(DetalleTransaccion detalleTransaccion);
    void deleteById(Long id);
}
