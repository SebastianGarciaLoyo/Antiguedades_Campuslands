package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IDespachoService;
import com.campusland.proyecto.domain.entity.Despacho;
import com.campusland.proyecto.infrastructure.repository.DespachoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class DespachoServiceImpl implements IDespachoService {

    @Autowired
    private DespachoRepository despachoRepository;

    @Override
    public List<Despacho> findAll() {
        return despachoRepository.findAll();
    }

    @Override
    public Despacho save(Despacho despacho) {
        return despachoRepository.save(despacho);
    }

    @Override
    public Despacho update(Despacho despacho) {
        if (despachoRepository.existsById(despacho.getId())) {
            return despachoRepository.save(despacho);
        } else {
            throw new EntityNotFoundException("Despacho no encontrado por id: " + despacho.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (despachoRepository.existsById(id)) {
            despachoRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Despacho no encontrado por id: " + id);
        }
    }
}
