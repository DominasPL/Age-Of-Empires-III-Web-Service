package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.AgeConverter;
import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.entities.Age;
import com.github.dominaspl.aoewebservice.repositories.AgeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgeServiceImpl implements AgeService {

    private AgeRepository ageRepository;
    private StatusService statusService;

    public AgeServiceImpl(AgeRepository ageRepository, StatusService statusService) {
        this.ageRepository = ageRepository;
        this.statusService = statusService;
    }

    @Override
    public List<AgeDTO> getAllAges() {

        List<Age> allAges = ageRepository.findAllByStatus(statusService.getAllStatuses().get(1));

        if (allAges == null) {
            throw new IllegalStateException("Ages not found!");
        }

        return AgeConverter.convertToAgeDTOList(allAges);
    }

    @Override
    public AgeDTO findById(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Age> optionalAge = ageRepository.findByAgeIdAndStatus(id, statusService.getAllStatuses().get(1));
        Age age = optionalAge.orElseThrow(() -> new IllegalStateException("Age not found!"));

        return AgeConverter.convertToAgeDTO(age);
    }

    @Override
    public void addNewAge(AgeDTO ageDTO) {

        if (ageDTO == null) {
            throw new IllegalArgumentException("Age must be given!");
        }

        if(!checkAgeIsAvailable(ageDTO)) {
            throw new IllegalArgumentException("Age is not available!");
        }

        ageRepository.save(AgeConverter.convertToAge(ageDTO, statusService.getAllStatuses().get(1)));
    }

    @Override
    public void updateAge(Long id, AgeDTO ageDTO) {

        if (id == null || ageDTO == null) {
            throw new IllegalArgumentException("Incorrect values!");
        }

        Optional<Age> optionalAge = ageRepository.findById(id);
        Age age = optionalAge.orElse(null);

        if (age == null) {
            addNewAge(ageDTO);
        } else {
            age.setAgeName(ageDTO.getAgeName());
            ageRepository.save(age);
        }

    }

    public boolean checkAgeIsAvailable(AgeDTO ageDTO) {

        Optional<Age> optionalAge = ageRepository.findByAgeName(ageDTO.getAgeName());
        Age age = optionalAge.orElse(null);

        return age == null;
    }
}
