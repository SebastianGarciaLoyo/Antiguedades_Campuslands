package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.TipoTransaccion;

public interface ITipoTransaccionService {
    List<TipoTransaccion> findAll();
    TipoTransaccion save(TipoTransaccion tipoTransaccion);
    TipoTransaccion update(TipoTransaccion tipoTransaccion);
    void deleteById(Long id);
}
