package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IPersonaTipoPersonaService;
import com.campusland.proyecto.domain.entity.PersonaTipoPersona;
import com.campusland.proyecto.infrastructure.repository.PersonaTipoPersonaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PersonaTipoPersonaServiceImpl implements IPersonaTipoPersonaService {

    @Autowired
    private PersonaTipoPersonaRepository personaTipoPersonaRepository;

    @Override
    public List<PersonaTipoPersona> findAll() {
        return personaTipoPersonaRepository.findAll();
    }

    @Override
    public PersonaTipoPersona save(PersonaTipoPersona personaTipoPersona) {
        return personaTipoPersonaRepository.save(personaTipoPersona);
    }

    @Override
    public PersonaTipoPersona update(PersonaTipoPersona personaTipoPersona) {
        if (personaTipoPersonaRepository.existsById(personaTipoPersona.getId())) {
            return personaTipoPersonaRepository.save(personaTipoPersona);
        } else {
            throw new EntityNotFoundException("Tipo de persona no encontrado por id: " + personaTipoPersona.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (personaTipoPersonaRepository.existsById(id)) {
            personaTipoPersonaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Tipo de persona no encontrado por id: " + id);
        }
    }
}
