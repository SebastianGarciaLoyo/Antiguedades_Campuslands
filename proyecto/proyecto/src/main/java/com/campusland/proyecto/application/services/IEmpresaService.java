package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.Empresa;

public interface IEmpresaService {
    List<Empresa> findAll();
    Empresa save(Empresa empresa);
    Empresa update(Empresa empresa);
    void deleteById(Long id);
}
