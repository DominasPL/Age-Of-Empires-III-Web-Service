package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.CivilizationCoverter;
import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.entities.Civilization;
import com.github.dominaspl.aoewebservice.repositories.CivilizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CivilizationServiceImpl implements CivilizationService {

    private CivilizationRepository civilizationRepository;

    public CivilizationServiceImpl(CivilizationRepository civilizationRepository) {
        this.civilizationRepository = civilizationRepository;
    }

    @Override
    public List<CivilizationDTO> getAllCivilizations() {

        List<Civilization> allCivilizations = civilizationRepository.findAll();

        if (allCivilizations == null) {
            throw new IllegalStateException("Civilizations not found!");
        }

        return CivilizationCoverter.convertToCivilizationDTOList(allCivilizations);
    }


}
