package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.CivilizationCoverter;
import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.entities.Civilization;
import com.github.dominaspl.aoewebservice.repositories.CivilizationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CivilizationServiceImpl implements CivilizationService {

    private CivilizationRepository civilizationRepository;
    private StatusService statusService;

    public CivilizationServiceImpl(CivilizationRepository civilizationRepository, StatusService statusService) {
        this.civilizationRepository = civilizationRepository;
        this.statusService = statusService;
    }

    @Override
    public List<CivilizationDTO> getAllCivilizations() {

        List<Civilization> allCivilizations = civilizationRepository.findByStatus(statusService.getAllStatuses().get(1));

        if (allCivilizations == null) {
            throw new IllegalStateException("Civilizations not found!");
        }

        return CivilizationCoverter.convertToCivilizationDTOList(allCivilizations);
    }

    @Override
    public CivilizationDTO getCivilizationById(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Civilization> optionalCivilization = civilizationRepository.findByCivilizationIdAndStatus(id, statusService.getAllStatuses().get(1));
        Civilization civilization = optionalCivilization.orElseThrow(() -> new IllegalStateException("Civilization not found!"));

        return CivilizationCoverter.convertToCivilizationDTO(civilization);
    }

    @Override
    @Transactional
    public void addNewCivilization(CivilizationDTO civilizationDTO) {

        if (civilizationDTO == null) {
            throw new IllegalArgumentException("Civilization must be given!");
        }

        if (!checkCivilizationNameIsAvailable(civilizationDTO.getCivilizationName())) {
            throw new IllegalArgumentException("This civilization is not available!");
        }

        Civilization civilization = CivilizationCoverter.convertToCivilization(civilizationDTO, statusService.getAllStatuses().get(1));
        civilizationRepository.save(civilization);

    }

    @Override
    public void updateCivilization(CivilizationDTO civilizationDTO, Long id) {

        if (civilizationDTO == null || id == null) {
            throw new IllegalArgumentException("Civilization and id must be given!");
        }

        Optional<Civilization> optionalCivilization = civilizationRepository.findByCivilizationIdAndStatus(id, statusService.getAllStatuses().get(1));
        Civilization civilization = optionalCivilization.orElse(null);

        if (civilization == null) {
            addNewCivilization(civilizationDTO);
        } else {
            civilization.setCivilizationName(civilizationDTO.getCivilizationName());
            civilizationRepository.save(civilization);
        }

    }

    @Override
    public CivilizationDTO deleteCivilization(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Civilization> optionalCivilization = civilizationRepository.findByCivilizationIdAndStatus(id, statusService.getAllStatuses().get(1));
        Civilization civilization = optionalCivilization.orElseThrow(() -> new IllegalStateException("Civilization not found!"));

        civilization.setStatus(statusService.getAllStatuses().get(0));
        civilizationRepository.save(civilization);

        return CivilizationCoverter.convertToCivilizationDTO(civilization);

    }

    public boolean checkCivilizationNameIsAvailable(String civilizationName) {

        Optional<Civilization> optionalCivilization = civilizationRepository.findByCivilizationName(civilizationName);
        Civilization civilization = optionalCivilization.orElse(null);

        return civilization == null;
    }


}
