package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IDetalleTransaccionService;
import com.campusland.proyecto.domain.entity.DetalleTransaccion;
import com.campusland.proyecto.infrastructure.repository.DetalleTransaccionRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class DetalleTransaccionServiceImpl implements IDetalleTransaccionService {

    @Autowired
    private DetalleTransaccionRepository detalleTransaccionRepository;

    @Override
    public List<DetalleTransaccion> findAll() {
        return detalleTransaccionRepository.findAll();
    }

    @Override
    public DetalleTransaccion save(DetalleTransaccion detalleTransaccion) {
        return detalleTransaccionRepository.save(detalleTransaccion);
    }

    @Override
    public DetalleTransaccion update(DetalleTransaccion detalleTransaccion) {
        if (detalleTransaccionRepository.existsById(detalleTransaccion.getId())) {
            return detalleTransaccionRepository.save(detalleTransaccion);
        } else {
            throw new EntityNotFoundException("Detalle de transacción no encontrado por id: " + detalleTransaccion.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (detalleTransaccionRepository.existsById(id)) {
            detalleTransaccionRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Detalle de transacción no encontrado por id: " + id);
        }
    }
}
