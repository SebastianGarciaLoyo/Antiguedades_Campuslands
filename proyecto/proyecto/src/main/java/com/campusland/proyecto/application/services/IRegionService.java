package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.Region;

public interface IRegionService {
    List<Region> findAll();
    Region save(Region region);
    Region update(Region region);
    void deleteById(Long id);
}
