package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IEmpleadoService;
import com.campusland.proyecto.domain.entity.Empleado;
import com.campusland.proyecto.infrastructure.repository.EmpleadoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado update(Empleado empleado) {
        if (empleadoRepository.existsById(empleado.getId())) {
            return empleadoRepository.save(empleado);
        } else {
            throw new EntityNotFoundException("Empleado no encontrado por id: " + empleado.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (empleadoRepository.existsById(id)) {
            empleadoRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Empleado no encontrado por id: " + id);
        }
    }
}

