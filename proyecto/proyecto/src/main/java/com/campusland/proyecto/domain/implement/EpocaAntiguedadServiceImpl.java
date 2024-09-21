package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IEpocaAntiguedadService;
import com.campusland.proyecto.domain.entity.EpocaAntiguedad;
import com.campusland.proyecto.infrastructure.repository.EpocaAntiguedadRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class EpocaAntiguedadServiceImpl implements IEpocaAntiguedadService {

    @Autowired
    private EpocaAntiguedadRepository epocaAntiguedadRepository;

    @Override
    public List<EpocaAntiguedad> findAll() {
        return epocaAntiguedadRepository.findAll();
    }

    @Override
    public EpocaAntiguedad save(EpocaAntiguedad epocaAntiguedad) {
        return epocaAntiguedadRepository.save(epocaAntiguedad);
    }

    @Override
    public EpocaAntiguedad update(EpocaAntiguedad epocaAntiguedad) {
        if (epocaAntiguedadRepository.existsById(epocaAntiguedad.getId())) {
            return epocaAntiguedadRepository.save(epocaAntiguedad);
        } else {
            throw new EntityNotFoundException("Época de antigüedad no encontrada por id: " + epocaAntiguedad.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (epocaAntiguedadRepository.existsById(id)) {
            epocaAntiguedadRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Época de antigüedad no encontrada por id: " + id);
        }
    }
}
