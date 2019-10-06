package com.github.dominaspl.aoewebservice.repositories;

import com.github.dominaspl.aoewebservice.entities.Status;
import com.github.dominaspl.aoewebservice.entities.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnitRepository extends JpaRepository<Unit, Long> {


    List<Unit> findByStatus(Status status);
}
