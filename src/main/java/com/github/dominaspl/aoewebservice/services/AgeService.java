package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.dtos.AgeDTO;

import java.util.List;

public interface AgeService {

    List<AgeDTO> getAllAges();

    AgeDTO findById(Long id);

    void addNewAge(AgeDTO ageDTO);

    void updateAge(Long id, AgeDTO ageDTO);

    AgeDTO deleteAge(Long id);
}
