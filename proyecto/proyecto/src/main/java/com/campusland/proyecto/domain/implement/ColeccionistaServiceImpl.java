package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IColeccionistaService;
import com.campusland.proyecto.domain.entity.Coleccionista;
import com.campusland.proyecto.infrastructure.repository.ColeccionistaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ColeccionistaServiceImpl implements IColeccionistaService {

    @Autowired
    private ColeccionistaRepository coleccionistaRepository;

    @Override
    public List<Coleccionista> findAll() {
        return coleccionistaRepository.findAll();
    }

    @Override
    public Coleccionista save(Coleccionista coleccionista) {
        return coleccionistaRepository.save(coleccionista);
    }

    @Override
    public Coleccionista update(Coleccionista coleccionista) {
        if (coleccionistaRepository.existsById(coleccionista.getId())) {
            return coleccionistaRepository.save(coleccionista);
        } else {
            throw new EntityNotFoundException("Coleccionista no encontrado por id: " + coleccionista.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (coleccionistaRepository.existsById(id)) {
            coleccionistaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Coleccionista no encontrado por id: " + id);
        }
    }
}
