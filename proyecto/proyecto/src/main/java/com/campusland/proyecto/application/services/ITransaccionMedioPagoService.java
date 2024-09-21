package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.TransaccionMedioPago;

public interface ITransaccionMedioPagoService {
    List<TransaccionMedioPago> findAll();
    TransaccionMedioPago save(TransaccionMedioPago transaccionMedioPago);
    TransaccionMedioPago update(TransaccionMedioPago transaccionMedioPago);
    void deleteById(Long id);
}
