package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.entities.Civilization;
import com.github.dominaspl.aoewebservice.entities.Status;

import java.util.ArrayList;
import java.util.List;

public class CivilizationConverter {

    public static List<CivilizationDTO> convertToCivilizationDTOList(List<Civilization> allCivilizations, Status status) {

        List<CivilizationDTO> civilizationDTOList = new ArrayList<>();

        for (Civilization civilization : allCivilizations) {
            CivilizationDTO civilizationDTO = new CivilizationDTO();
            if (civilization.getStatus() == status) {
                civilizationDTO.setCivilizationId(civilization.getCivilizationId());
                civilizationDTO.setCivilizationName(civilization.getCivilizationName());
                civilizationDTOList.add(civilizationDTO);
            }
        }

        return civilizationDTOList;
    }

    public static CivilizationDTO convertToCivilizationDTO(Civilization civilization) {

        CivilizationDTO civilizationDTO = new CivilizationDTO();
        civilizationDTO.setCivilizationName(civilization.getCivilizationName());
        return civilizationDTO;
    }

    public static Civilization convertToCivilization(CivilizationDTO civilizationDTO, Status status) {

        Civilization civilization = new Civilization();
        civilization.setCivilizationName(civilizationDTO.getCivilizationName());
        civilization.setStatus(status);
        return civilization;
    }

    public static List<Civilization> convertToCivilizationList(List<CivilizationDTO> civilizationsDTO, Status status) {

        List<Civilization> civilizations = new ArrayList<>();

        for (CivilizationDTO civilizationDTO : civilizationsDTO) {
            Civilization civilization = new Civilization();
            civilization.setCivilizationId(civilizationDTO.getCivilizationId());
            civilization.setCivilizationName(civilizationDTO.getCivilizationName());
            civilization.setStatus(status);
            civilizations.add(civilization);
        }

        return civilizations;
    }
}
