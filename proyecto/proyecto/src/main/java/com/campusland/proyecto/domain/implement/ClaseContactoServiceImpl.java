package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IClaseContactoService;
import com.campusland.proyecto.domain.entity.ClaseContacto;
import com.campusland.proyecto.infrastructure.repository.ClaseContactoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ClaseContactoServiceImpl implements IClaseContactoService {

    @Autowired
    private ClaseContactoRepository claseContactoRepository;

    @Override
    public List<ClaseContacto> findAll() {
        return claseContactoRepository.findAll();
    }

    @Override
    public ClaseContacto save(ClaseContacto claseContacto) {
        return claseContactoRepository.save(claseContacto);
    }

    @Override
    public ClaseContacto update(ClaseContacto claseContacto) {
        if (claseContactoRepository.existsById(claseContacto.getId())) {
            return claseContactoRepository.save(claseContacto);
        } else {
            throw new EntityNotFoundException("Clase de contacto no encontrada por id: " + claseContacto.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (claseContactoRepository.existsById(id)) {
            claseContactoRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Clase de contacto no encontrada por id: " + id);
        }
    }
}
