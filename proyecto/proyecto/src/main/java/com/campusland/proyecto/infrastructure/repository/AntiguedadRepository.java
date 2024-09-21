package com.campusland.proyecto.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campusland.proyecto.domain.entity.Antiguedad;

@Repository
public interface AntiguedadRepository extends JpaRepository<Antiguedad, Long> {

}

