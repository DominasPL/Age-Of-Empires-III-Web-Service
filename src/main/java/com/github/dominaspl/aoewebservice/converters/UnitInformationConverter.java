package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.*;
import com.github.dominaspl.aoewebservice.entities.Status;
import com.github.dominaspl.aoewebservice.entities.UnitInformation;

import java.util.ArrayList;
import java.util.Set;

public class UnitInformationConverter {

    public static UnitInformationDTO convertToUnitInformationDTO(UnitInformation unitInformation, Status status) {

        UnitInformationDTO unitInformationDTO = new UnitInformationDTO();
        unitInformationDTO.setAge(AgeConverter.convertToAgeDTO(unitInformation.getAge(), status));
        unitInformationDTO.setCivilizations(CivilizationConverter.convertToCivilizationDTOList(unitInformation.getCivilizations(), status));
        unitInformationDTO.setTypes(TypeConverter.convertToTypeDTOList(unitInformation.getTypes(), status));
        unitInformationDTO.setStats(StatsConverter.convertToStatsDTO(unitInformation.getStatistics()));


        return unitInformationDTO;

    }

    public static UnitInformation convertToUnitInformation(AgeDTO age, Set<TypeDTO> filteredTypes,
                                                           Set<CivilizationDTO> filteredCivilizations,
                                                           StatsDTO statistics,
                                                           Status status) {

        UnitInformation unitInformation = new UnitInformation();
        unitInformation.setAge(AgeConverter.convertToAge(age, status));
        unitInformation.setTypes(TypeConverter.convertToTypeList(filteredTypes, status));
        unitInformation.setCivilizations(CivilizationConverter.convertToCivilizationList(new ArrayList<>(filteredCivilizations), status));
        unitInformation.setStatistics(StatsConverter.convertToStats(statistics));

        return unitInformation;
    }
}
