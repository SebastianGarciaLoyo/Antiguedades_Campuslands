package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.ISucursalService;
import com.campusland.proyecto.domain.entity.Sucursal;
import com.campusland.proyecto.infrastructure.repository.SucursalRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class SucursalServiceImpl implements ISucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    @Override
    public List<Sucursal> findAll() {
        return sucursalRepository.findAll();
    }

    @Override
    public Sucursal save(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    @Override
    public Sucursal update(Sucursal sucursal) {
        if (sucursalRepository.existsById(sucursal.getId())) {
            return sucursalRepository.save(sucursal);
        } else {
            throw new EntityNotFoundException("Sucursal no encontrada por id: " + sucursal.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (sucursalRepository.existsById(id)) {
            sucursalRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Sucursal no encontrada por id: " + id);
        }
    }
}
