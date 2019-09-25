package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.entities.Civilization;

import java.util.ArrayList;
import java.util.List;

public class CivilizationCoverter {

    public static List<CivilizationDTO> convertToCivilizationDTOList(List<Civilization> allCivilizations) {

        List<CivilizationDTO> civilizationDTOList = new ArrayList<>();

        for (Civilization civilization : allCivilizations) {
            CivilizationDTO civilizationDTO = new CivilizationDTO();
            civilizationDTO.setCivilizationName(civilization.getCivilizationName());
            civilizationDTOList.add(civilizationDTO);
        }

        return civilizationDTOList;
    }

    public static CivilizationDTO convertToCivilizationDTO(Civilization civilization) {

        CivilizationDTO civilizationDTO = new CivilizationDTO();
        civilizationDTO.setCivilizationName(civilization.getCivilizationName());
        return civilizationDTO;
    }

    public static Civilization convertToCivilization(CivilizationDTO civilizationDTO) {

        Civilization civilization = new Civilization();
        civilization.setCivilizationName(civilizationDTO.getCivilizationName());
        return civilization;

    }
}