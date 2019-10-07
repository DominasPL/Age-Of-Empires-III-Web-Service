package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.dtos.TypeDTO;
import com.github.dominaspl.aoewebservice.dtos.UnitInformationDTO;
import com.github.dominaspl.aoewebservice.entities.Status;
import com.github.dominaspl.aoewebservice.entities.UnitInformation;

import java.util.ArrayList;
import java.util.Set;

public class UnitInformationConverter {

    public static UnitInformationDTO convertToUnitInformationDTO(UnitInformation unitInformation) {

        UnitInformationDTO unitInformationDTO = new UnitInformationDTO();
        unitInformationDTO.setAge(AgeConverter.convertToAgeDTO(unitInformation.getAge()));
        unitInformationDTO.setCivilizations(CivilizationCoverter.convertToCivilizationDTOList(unitInformation.getCivilizations()));
        unitInformationDTO.setTypes(TypeConverter.convertToTypeDTOList(unitInformation.getTypes()));

        return unitInformationDTO;

    }


    public static UnitInformation convertToUnitInformation(AgeDTO age, Set<TypeDTO> filteredTypes, Set<CivilizationDTO> filteredCivilizations, Status status) {

        UnitInformation unitInformation = new UnitInformation();
        unitInformation.setAge(AgeConverter.convertToAge(age, status));
        unitInformation.setTypes(TypeConverter.convertToTypeList(filteredTypes));
        unitInformation.setCivilizations(CivilizationCoverter.convertToCivilizationList(new ArrayList<>(filteredCivilizations), status));

        return unitInformation;
    }
}
