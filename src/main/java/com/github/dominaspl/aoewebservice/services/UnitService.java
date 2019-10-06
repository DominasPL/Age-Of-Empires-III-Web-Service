package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.dtos.UnitDTO;

import java.util.List;

public interface UnitService {

    List<UnitDTO> getAllUnits();

    UnitDTO findUnitById(Long id);
}
