package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IPaisService;
import com.campusland.proyecto.domain.entity.Pais;
import com.campusland.proyecto.infrastructure.repository.PaisRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PaisServiceImpl implements IPaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    @Override
    public Pais save(Pais pais) {
        return paisRepository.save(pais);
    }

    @Override
    public Pais update(Pais pais) {
        if (paisRepository.existsById(pais.getId())) {
            return paisRepository.save(pais);
        } else {
            throw new EntityNotFoundException("País no encontrado por id: " + pais.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (paisRepository.existsById(id)) {
            paisRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("País no encontrado por id: " + id);
        }
    }
}
