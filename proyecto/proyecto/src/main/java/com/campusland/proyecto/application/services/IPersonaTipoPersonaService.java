package com.campusland.proyecto.application.services;


import java.util.List;
import com.campusland.proyecto.domain.entity.PersonaTipoPersona;

public interface IPersonaTipoPersonaService {
    List<PersonaTipoPersona> findAll();
    PersonaTipoPersona save(PersonaTipoPersona personaTipoPersona);
    PersonaTipoPersona update(PersonaTipoPersona personaTipoPersona);
    void deleteById(Long id);
}

