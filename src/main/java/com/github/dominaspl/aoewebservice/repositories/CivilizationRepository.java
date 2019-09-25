package com.github.dominaspl.aoewebservice.repositories;

import com.github.dominaspl.aoewebservice.entities.Civilization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CivilizationRepository extends JpaRepository<Civilization, Long> {


    Optional<Civilization> findByCivilizationName(String civilizationName);
}
