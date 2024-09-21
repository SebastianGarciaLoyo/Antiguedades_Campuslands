package com.campusland.proyecto.application.services;

import java.util.List;
import com.campusland.proyecto.domain.entity.RankingAntiguedad;

public interface IRankingAntiguedadService {
    List<RankingAntiguedad> findAll();
    RankingAntiguedad save(RankingAntiguedad rankingAntiguedad);
    RankingAntiguedad update(RankingAntiguedad rankingAntiguedad);
    void deleteById(Long id);
}
