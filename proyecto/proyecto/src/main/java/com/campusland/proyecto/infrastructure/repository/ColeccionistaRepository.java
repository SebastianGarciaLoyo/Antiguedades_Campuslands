package com.campusland.proyecto.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campusland.proyecto.domain.entity.Coleccionista;

@Repository
public interface ColeccionistaRepository extends JpaRepository<Coleccionista, Long> {

}

