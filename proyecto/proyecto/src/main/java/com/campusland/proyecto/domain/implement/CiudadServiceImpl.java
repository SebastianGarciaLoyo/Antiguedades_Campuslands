package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.ICiudadService;
import com.campusland.proyecto.domain.entity.Ciudad;
import com.campusland.proyecto.infrastructure.repository.CiudadRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class CiudadServiceImpl implements ICiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }

    @Override
    public Ciudad save(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public Ciudad update(Ciudad ciudad) {
        if (ciudadRepository.existsById(ciudad.getId())) {
            return ciudadRepository.save(ciudad);
        } else {
            throw new EntityNotFoundException("Ciudad no encontrada por id: " + ciudad.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (ciudadRepository.existsById(id)) {
            ciudadRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Ciudad no encontrada por id: " + id);
        }
    }
}
