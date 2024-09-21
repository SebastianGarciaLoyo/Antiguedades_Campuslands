package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IGeneroService;
import com.campusland.proyecto.domain.entity.Genero;
import com.campusland.proyecto.infrastructure.repository.GeneroRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class GeneroServiceImpl implements IGeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    @Override
    public List<Genero> findAll() {
        return generoRepository.findAll();
    }

    @Override
    public Genero save(Genero genero) {
        return generoRepository.save(genero);
    }

    @Override
    public Genero update(Genero genero) {
        if (generoRepository.existsById(genero.getId())) {
            return generoRepository.save(genero);
        } else {
            throw new EntityNotFoundException("Género no encontrado por id: " + genero.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (generoRepository.existsById(id)) {
            generoRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Género no encontrado por id: " + id);
        }
    }
}
