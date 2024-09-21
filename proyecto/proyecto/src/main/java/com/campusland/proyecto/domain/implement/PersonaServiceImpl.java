package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IPersonaService;
import com.campusland.proyecto.domain.entity.Persona;
import com.campusland.proyecto.infrastructure.repository.PersonaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona update(Persona persona) {
        if (personaRepository.existsById(persona.getId())) {
            return personaRepository.save(persona);
        } else {
            throw new EntityNotFoundException("Persona no encontrada por id: " + persona.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (personaRepository.existsById(id)) {
            personaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Persona no encontrada por id: " + id);
        }
    }
}
