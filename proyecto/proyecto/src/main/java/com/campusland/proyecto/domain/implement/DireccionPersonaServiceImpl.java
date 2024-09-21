package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IDireccionPersonaService;
import com.campusland.proyecto.domain.entity.DireccionPersona;
import com.campusland.proyecto.infrastructure.repository.DireccionPersonaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class DireccionPersonaServiceImpl implements IDireccionPersonaService {

    @Autowired
    private DireccionPersonaRepository direccionPersonaRepository;

    @Override
    public List<DireccionPersona> findAll() {
        return direccionPersonaRepository.findAll();
    }

    @Override
    public DireccionPersona save(DireccionPersona direccionPersona) {
        return direccionPersonaRepository.save(direccionPersona);
    }

    @Override
    public DireccionPersona update(DireccionPersona direccionPersona) {
        if (direccionPersonaRepository.existsById(direccionPersona.getId())) {
            return direccionPersonaRepository.save(direccionPersona);
        } else {
            throw new EntityNotFoundException("Dirección de persona no encontrada por id: " + direccionPersona.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (direccionPersonaRepository.existsById(id)) {
            direccionPersonaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Dirección de persona no encontrada por id: " + id);
        }
    }
}
