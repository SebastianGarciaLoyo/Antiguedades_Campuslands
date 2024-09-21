package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IEmpresaService;
import com.campusland.proyecto.domain.entity.Empresa;
import com.campusland.proyecto.infrastructure.repository.EmpresaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    @Override
    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa update(Empresa empresa) {
        if (empresaRepository.existsById(empresa.getId())) {
            return empresaRepository.save(empresa);
        } else {
            throw new EntityNotFoundException("Empresa no encontrada por id: " + empresa.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (empresaRepository.existsById(id)) {
            empresaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Empresa no encontrada por id: " + id);
        }
    }
}
