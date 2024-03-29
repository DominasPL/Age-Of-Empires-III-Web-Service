package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;

import java.util.List;

public interface CivilizationService {

    List<CivilizationDTO> getAllCivilizations();

    CivilizationDTO getCivilizationById(Long id);

    void addNewCivilization(CivilizationDTO civilizationDTO);

    void updateCivilization(CivilizationDTO civilizationDTO, Long id);

    CivilizationDTO deleteCivilization(Long id);
}
