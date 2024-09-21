package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IAntiguedadService;
import com.campusland.proyecto.domain.entity.Antiguedad;
import com.campusland.proyecto.infrastructure.repository.AntiguedadRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class AntiguedadServiceImpl implements IAntiguedadService {

    @Autowired
    private AntiguedadRepository antiguedadRepository;

    @Override
    public List<Antiguedad> findAll() {
        return antiguedadRepository.findAll();
    }

    @Override
    public Antiguedad save(Antiguedad antiguedad) {
        return antiguedadRepository.save(antiguedad);
    }

    @Override
    public Antiguedad update(Antiguedad antiguedad) {
        if (antiguedadRepository.existsById(antiguedad.getId())) {
            return antiguedadRepository.save(antiguedad);
        } else {
            throw new EntityNotFoundException("Antigüedad no encontrada por id: " + antiguedad.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (antiguedadRepository.existsById(id)) {
            antiguedadRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Antigüedad no encontrada por id: " + id);
        }
    }
}
