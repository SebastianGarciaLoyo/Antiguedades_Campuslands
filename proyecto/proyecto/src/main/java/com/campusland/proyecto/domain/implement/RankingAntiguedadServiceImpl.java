package com.campusland.proyecto.domain.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campusland.proyecto.application.services.IRankingAntiguedadService;
import com.campusland.proyecto.domain.entity.RankingAntiguedad;
import com.campusland.proyecto.infrastructure.repository.RankingAntiguedadRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class RankingAntiguedadServiceImpl implements IRankingAntiguedadService {

    @Autowired
    private RankingAntiguedadRepository rankingAntiguedadRepository;

    @Override
    public List<RankingAntiguedad> findAll() {
        return rankingAntiguedadRepository.findAll();
    }

    @Override
    public RankingAntiguedad save(RankingAntiguedad rankingAntiguedad) {
        return rankingAntiguedadRepository.save(rankingAntiguedad);
    }

    @Override
    public RankingAntiguedad update(RankingAntiguedad rankingAntiguedad) {
        if (rankingAntiguedadRepository.existsById(rankingAntiguedad.getId())) {
            return rankingAntiguedadRepository.save(rankingAntiguedad);
        } else {
            throw new EntityNotFoundException("Ranking de antigüedad no encontrado por id: " + rankingAntiguedad.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (rankingAntiguedadRepository.existsById(id)) {
            rankingAntiguedadRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Ranking de antigüedad no encontrado por id: " + id);
        }
    }
}
