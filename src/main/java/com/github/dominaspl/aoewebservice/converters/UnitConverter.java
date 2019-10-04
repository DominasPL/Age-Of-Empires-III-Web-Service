package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.UnitDTO;
import com.github.dominaspl.aoewebservice.entities.Unit;

import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

    public static List<UnitDTO> convertToUnitDTOList(List<Unit> allUnits) {

        List<UnitDTO> unitDTOList = new ArrayList<>();


        for (Unit unit : allUnits) {
            UnitDTO unitDTO = new UnitDTO();
            unitDTO.setUnitName(unit.getUnitName());
            unitDTO.setUnitInformation(unit.getUnitInformation());
            unitDTOList.add(unitDTO);
        }

        return unitDTOList;
    }
}
