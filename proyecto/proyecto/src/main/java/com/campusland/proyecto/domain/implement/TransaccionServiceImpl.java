package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.ITransaccionService;
import com.campusland.proyecto.domain.entity.Transaccion;
import com.campusland.proyecto.infrastructure.repository.TransaccionRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class TransaccionServiceImpl implements ITransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;

    @Override
    public List<Transaccion> findAll() {
        return transaccionRepository.findAll();
    }

    @Override
    public Transaccion save(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    @Override
    public Transaccion update(Transaccion transaccion) {
        if (transaccionRepository.existsById(transaccion.getId())) {
            return transaccionRepository.save(transaccion);
        } else {
            throw new EntityNotFoundException("Transacción no encontrada por id: " + transaccion.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (transaccionRepository.existsById(id)) {
            transaccionRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Transacción no encontrada por id: " + id);
        }
    }
}
