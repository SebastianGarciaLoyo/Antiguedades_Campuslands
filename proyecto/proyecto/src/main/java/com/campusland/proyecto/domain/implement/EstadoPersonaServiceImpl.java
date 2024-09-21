package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IEstadoPersonaService;
import com.campusland.proyecto.domain.entity.EstadoPersona;
import com.campusland.proyecto.infrastructure.repository.EstadoPersonaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class EstadoPersonaServiceImpl implements IEstadoPersonaService {

    @Autowired
    private EstadoPersonaRepository estadoPersonaRepository;

    @Override
    public List<EstadoPersona> findAll() {
        return estadoPersonaRepository.findAll();
    }

    @Override
    public EstadoPersona save(EstadoPersona estadoPersona) {
        return estadoPersonaRepository.save(estadoPersona);
    }

    @Override
    public EstadoPersona update(EstadoPersona estadoPersona) {
        if (estadoPersonaRepository.existsById(estadoPersona.getId())) {
            return estadoPersonaRepository.save(estadoPersona);
        } else {
            throw new EntityNotFoundException("Estado de persona no encontrado por id: " + estadoPersona.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (estadoPersonaRepository.existsById(id)) {
            estadoPersonaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Estado de persona no encontrado por id: " + id);
        }
    }
}
