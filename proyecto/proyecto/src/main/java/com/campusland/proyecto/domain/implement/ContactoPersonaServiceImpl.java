package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IContactoPersonaService;
import com.campusland.proyecto.domain.entity.ContactoPersona;
import com.campusland.proyecto.infrastructure.repository.ContactoPersonaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ContactoPersonaServiceImpl implements IContactoPersonaService {

    @Autowired
    private ContactoPersonaRepository contactoPersonaRepository;

    @Override
    public List<ContactoPersona> findAll() {
        return contactoPersonaRepository.findAll();
    }

    @Override
    public ContactoPersona save(ContactoPersona contactoPersona) {
        return contactoPersonaRepository.save(contactoPersona);
    }

    @Override
    public ContactoPersona update(ContactoPersona contactoPersona) {
        if (contactoPersonaRepository.existsById(contactoPersona.getId())) {
            return contactoPersonaRepository.save(contactoPersona);
        } else {
            throw new EntityNotFoundException("Contacto no encontrado por id: " + contactoPersona.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (contactoPersonaRepository.existsById(id)) {
            contactoPersonaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Contacto no encontrado por id: " + id);
        }
    }
}
