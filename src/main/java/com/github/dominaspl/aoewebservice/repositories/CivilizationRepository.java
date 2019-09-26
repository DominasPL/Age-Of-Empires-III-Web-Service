package com.github.dominaspl.aoewebservice.repositories;

import com.github.dominaspl.aoewebservice.entities.Civilization;
import com.github.dominaspl.aoewebservice.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CivilizationRepository extends JpaRepository<Civilization, Long> {


    Optional<Civilization> findByCivilizationName(String civilizationName);
    Optional<Civilization> findByCivilizationIdAndStatus(Long id, Status status);
    List<Civilization> findByStatus(Status status);
}
