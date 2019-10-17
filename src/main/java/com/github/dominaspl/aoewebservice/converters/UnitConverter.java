package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.dtos.TypeDTO;
import com.github.dominaspl.aoewebservice.dtos.UnitDTO;
import com.github.dominaspl.aoewebservice.entities.Status;
import com.github.dominaspl.aoewebservice.entities.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UnitConverter {

    public static List<UnitDTO> convertToUnitDTOList(List<Unit> allUnits, Status status) {

        List<UnitDTO> unitDTOList = new ArrayList<>();
        for (Unit unit : allUnits) {
            UnitDTO unitDTO = new UnitDTO();
            unitDTO.setUnitInformation(UnitInformationConverter.convertToUnitInformationDTO(unit.getUnitInformation(), status));
            unitDTO.setUnitName(unit.getUnitName());
            unitDTOList.add(unitDTO);
        }

        return unitDTOList;
    }

    public static UnitDTO convertToUnitDTO(Unit unit, Status status) {

        UnitDTO unitDTO = new UnitDTO();
        unitDTO.setUnitName(unit.getUnitName());
        unitDTO.setUnitInformation(UnitInformationConverter.convertToUnitInformationDTO(unit.getUnitInformation(), status));

        return unitDTO;
    }


    public static Unit convertToUnit(String unitName, AgeDTO age, Set<TypeDTO> filteredTypes, Set<CivilizationDTO> filteredCivilizations, Status status) {

        Unit unit = new Unit();
        unit.setUnitName(unitName);
        unit.setStatus(status);
        unit.setUnitInformation(UnitInformationConverter.convertToUnitInformation(age, filteredTypes, filteredCivilizations, status));

        return unit;
    }
}
