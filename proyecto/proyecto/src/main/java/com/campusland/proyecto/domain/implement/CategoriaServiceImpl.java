package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.ICategoriaService;
import com.campusland.proyecto.domain.entity.Categoria;
import com.campusland.proyecto.infrastructure.repository.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria update(Categoria categoria) {
        if (categoriaRepository.existsById(categoria.getId())) {
            return categoriaRepository.save(categoria);
        } else {
            throw new EntityNotFoundException("Categoría no encontrada por id: " + categoria.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Categoría no encontrada por id: " + id);
        }
    }
}
