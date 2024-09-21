package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.ITransaccionMedioPagoService;
import com.campusland.proyecto.domain.entity.TransaccionMedioPago;
import com.campusland.proyecto.infrastructure.repository.TransaccionMedioPagoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class TransaccionMedioPagoServiceImpl implements ITransaccionMedioPagoService {

    @Autowired
    private TransaccionMedioPagoRepository transaccionMedioPagoRepository;

    @Override
    public List<TransaccionMedioPago> findAll() {
        return transaccionMedioPagoRepository.findAll();
    }

    @Override
    public TransaccionMedioPago save(TransaccionMedioPago transaccionMedioPago) {
        return transaccionMedioPagoRepository.save(transaccionMedioPago);
    }

    @Override
    public TransaccionMedioPago update(TransaccionMedioPago transaccionMedioPago) {
        if (transaccionMedioPagoRepository.existsById(transaccionMedioPago.getId())) {
            return transaccionMedioPagoRepository.save(transaccionMedioPago);
        } else {
            throw new EntityNotFoundException("Transacción medio de pago no encontrada por id: " + transaccionMedioPago.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (transaccionMedioPagoRepository.existsById(id)) {
            transaccionMedioPagoRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Transacción medio de pago no encontrada por id: " + id);
        }
    }
}
