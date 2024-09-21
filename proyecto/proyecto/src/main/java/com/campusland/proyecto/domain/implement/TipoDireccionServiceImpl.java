package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.ITipoDireccionService;
import com.campusland.proyecto.domain.entity.TipoDireccion;
import com.campusland.proyecto.infrastructure.repository.TipoDireccionRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class TipoDireccionServiceImpl implements ITipoDireccionService {

    @Autowired
    private TipoDireccionRepository tipoDireccionRepository;

    @Override
    public List<TipoDireccion> findAll() {
        return tipoDireccionRepository.findAll();
    }

    @Override
    public TipoDireccion save(TipoDireccion tipoDireccion) {
        return tipoDireccionRepository.save(tipoDireccion);
    }

    @Override
    public TipoDireccion update(TipoDireccion tipoDireccion) {
        if (tipoDireccionRepository.existsById(tipoDireccion.getId())) {
            return tipoDireccionRepository.save(tipoDireccion);
        } else {
            throw new EntityNotFoundException("Tipo de dirección no encontrado por id: " + tipoDireccion.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (tipoDireccionRepository.existsById(id)) {
            tipoDireccionRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Tipo de dirección no encontrado por id: " + id);
        }
    }
}
