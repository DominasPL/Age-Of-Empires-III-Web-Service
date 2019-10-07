package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.dtos.UnitDTO;

import java.util.List;

public interface UnitService {

    List<UnitDTO> getAllUnits();

    UnitDTO findUnitById(Long id);

    void addNewUnit(UnitDTO unitDTO);

    void updateUnitData(Long id, UnitDTO unitDTO);

    UnitDTO deleteUnit(Long id);
}
