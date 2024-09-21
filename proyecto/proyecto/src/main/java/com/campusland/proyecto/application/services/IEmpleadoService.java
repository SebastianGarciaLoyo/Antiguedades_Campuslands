package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.Empleado;

public interface IEmpleadoService {
    List<Empleado> findAll();
    Empleado save(Empleado empleado);
    Empleado update(Empleado empleado);
    void deleteById(Long id);
}

