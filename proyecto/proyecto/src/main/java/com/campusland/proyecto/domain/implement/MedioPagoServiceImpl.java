package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IMedioPagoService;
import com.campusland.proyecto.domain.entity.MedioPago;
import com.campusland.proyecto.infrastructure.repository.MedioPagoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class MedioPagoServiceImpl implements IMedioPagoService {

    @Autowired
    private MedioPagoRepository medioPagoRepository;

    @Override
    public List<MedioPago> findAll() {
        return medioPagoRepository.findAll();
    }

    @Override
    public MedioPago save(MedioPago medioPago) {
        return medioPagoRepository.save(medioPago);
    }

    @Override
    public MedioPago update(MedioPago medioPago) {
        if (medioPagoRepository.existsById(medioPago.getId())) {
            return medioPagoRepository.save(medioPago);
        } else {
            throw new EntityNotFoundException("Medio de pago no encontrado por id: " + medioPago.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (medioPagoRepository.existsById(id)) {
            medioPagoRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Medio de pago no encontrado por id: " + id);
        }
    }
}
