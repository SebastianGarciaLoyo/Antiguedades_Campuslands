package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.ITipoTransaccionService;
import com.campusland.proyecto.domain.entity.TipoTransaccion;
import com.campusland.proyecto.infrastructure.repository.TipoTransaccionRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class TipoTransaccionServiceImpl implements ITipoTransaccionService {

    @Autowired
    private TipoTransaccionRepository tipoTransaccionRepository;

    @Override
    public List<TipoTransaccion> findAll() {
        return tipoTransaccionRepository.findAll();
    }

    @Override
    public TipoTransaccion save(TipoTransaccion tipoTransaccion) {
        return tipoTransaccionRepository.save(tipoTransaccion);
    }

    @Override
    public TipoTransaccion update(TipoTransaccion tipoTransaccion) {
        if (tipoTransaccionRepository.existsById(tipoTransaccion.getId())) {
            return tipoTransaccionRepository.save(tipoTransaccion);
        } else {
            throw new EntityNotFoundException("Tipo de transacción no encontrado por id: " + tipoTransaccion.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (tipoTransaccionRepository.existsById(id)) {
            tipoTransaccionRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Tipo de transacción no encontrado por id: " + id);
        }
    }
}
