package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.ContactoPersona;

public interface IContactoPersonaService {
    List<ContactoPersona> findAll();
    ContactoPersona save(ContactoPersona contactoPersona);
    ContactoPersona update(ContactoPersona contactoPersona);
    void deleteById(Long id);
}

