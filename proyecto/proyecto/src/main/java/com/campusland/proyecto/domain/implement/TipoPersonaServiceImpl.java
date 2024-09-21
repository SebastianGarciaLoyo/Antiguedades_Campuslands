package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.ITipoPersonaService;
import com.campusland.proyecto.domain.entity.TipoPersona;
import com.campusland.proyecto.infrastructure.repository.TipoPersonaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class TipoPersonaServiceImpl implements ITipoPersonaService {

    @Autowired
    private TipoPersonaRepository tipoPersonaRepository;

    @Override
    public List<TipoPersona> findAll() {
        return tipoPersonaRepository.findAll();
    }

    @Override
    public TipoPersona save(TipoPersona tipoPersona) {
        return tipoPersonaRepository.save(tipoPersona);
    }

    @Override
    public TipoPersona update(TipoPersona tipoPersona) {
        if (tipoPersonaRepository.existsById(tipoPersona.getId())) {
            return tipoPersonaRepository.save(tipoPersona);
        } else {
            throw new EntityNotFoundException("Tipo de persona no encontrado por id: " + tipoPersona.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (tipoPersonaRepository.existsById(id)) {
            tipoPersonaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Tipo de persona no encontrado por id: " + id);
        }
    }
}
