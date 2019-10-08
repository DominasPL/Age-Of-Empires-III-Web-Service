package com.github.dominaspl.aoewebservice.repositories;

import com.github.dominaspl.aoewebservice.entities.Status;
import com.github.dominaspl.aoewebservice.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type, Long> {


    List<Type> findAllByStatus(Status status);

    Optional<Type> findByTypeIdAndStatus(Long id, Status status);
}
