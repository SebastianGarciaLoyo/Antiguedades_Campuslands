package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IRegionService;
import com.campusland.proyecto.domain.entity.Region;
import com.campusland.proyecto.infrastructure.repository.RegionRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class RegionServiceImpl implements IRegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    @Override
    public Region save(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public Region update(Region region) {
        if (regionRepository.existsById(region.getId())) {
            return regionRepository.save(region);
        } else {
            throw new EntityNotFoundException("Región no encontrada por id: " + region.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (regionRepository.existsById(id)) {
            regionRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Región no encontrada por id: " + id);
        }
    }
}
