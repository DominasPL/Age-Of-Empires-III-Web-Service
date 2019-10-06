package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.UnitInformationDTO;
import com.github.dominaspl.aoewebservice.entities.UnitInformation;

public class UnitInformationConverter {

    public static UnitInformationDTO convertToUnitInformationDTO(UnitInformation unitInformation) {

        UnitInformationDTO unitInformationDTO = new UnitInformationDTO();
        unitInformationDTO.setAge(AgeConverter.convertToAgeDTO(unitInformation.getAge()));
        unitInformationDTO.setCivilizations(CivilizationCoverter.convertToCivilizationDTOList(unitInformation.getCivilizations()));
        unitInformationDTO.setTypes(TypeConverter.convertToTypeDTOList(unitInformation.getTypes()));

        return unitInformationDTO;

    }
}
