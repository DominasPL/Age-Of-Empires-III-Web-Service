package com.github.dominaspl.aoewebservice.repositories;

import com.github.dominaspl.aoewebservice.entities.Age;
import com.github.dominaspl.aoewebservice.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgeRepository extends JpaRepository<Age, Long> {
    List<Age> findAllByStatus(Status status);
}
