package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.EpocaAntiguedad;

public interface IEpocaAntiguedadService {
    List<EpocaAntiguedad> findAll();
    EpocaAntiguedad save(EpocaAntiguedad epocaAntiguedad);
    EpocaAntiguedad update(EpocaAntiguedad epocaAntiguedad);
    void deleteById(Long id);
}
