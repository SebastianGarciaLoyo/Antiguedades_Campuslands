package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IHistorialPropiedadService;
import com.campusland.proyecto.domain.entity.HistorialPropiedad;
import com.campusland.proyecto.infrastructure.repository.HistorialPropiedadRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class HistorialPropiedadServiceImpl implements IHistorialPropiedadService {

    @Autowired
    private HistorialPropiedadRepository historialPropiedadRepository;

    @Override
    public List<HistorialPropiedad> findAll() {
        return historialPropiedadRepository.findAll();
    }

    @Override
    public HistorialPropiedad save(HistorialPropiedad historialPropiedad) {
        return historialPropiedadRepository.save(historialPropiedad);
    }

    @Override
    public HistorialPropiedad update(HistorialPropiedad historialPropiedad) {
        if (historialPropiedadRepository.existsById(historialPropiedad.getId())) {
            return historialPropiedadRepository.save(historialPropiedad);
        } else {
            throw new EntityNotFoundException("Historial de propiedad no encontrado por id: " + historialPropiedad.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (historialPropiedadRepository.existsById(id)) {
            historialPropiedadRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Historial de propiedad no encontrado por id: " + id);
        }
    }
}
