package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.AgeConverter;
import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.entities.Age;
import com.github.dominaspl.aoewebservice.entities.Status;
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
        Status status = statusService.getAllStatuses().get(1);
        Optional<Age> optionalAge = ageRepository.findByAgeIdAndStatus(id, status);
        Age age = optionalAge.orElseThrow(() -> new IllegalStateException("Age not found!"));

        return AgeConverter.convertToAgeDTO(age, status);
    }

    @Override
    public void addNewAge(AgeDTO ageDTO) {

        if (ageDTO == null) {
            throw new IllegalArgumentException("Age must be given!");
        }

        Optional<Age> optionalAge = ageRepository.findByAgeName(ageDTO.getAgeName());
        Age age = optionalAge.orElse(null);
        Status status = statusService.getAllStatuses().get(1);

        if (age == null) {
            ageRepository.save(AgeConverter.convertToAge(ageDTO, status));
        } else if (age.getStatus() != status) {
            age.setStatus(status);
            ageRepository.save(age);
        } else {
            throw new IllegalStateException("Age is not available!");
        }
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
        } else if (age.getStatus() == statusService.getAllStatuses().get(0)) {
            throw new IllegalStateException("Age not found!");
        } else {
            age.setAgeName(ageDTO.getAgeName());
            ageRepository.save(age);
        }

    }

    @Override
    public AgeDTO deleteAge(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Age> optionalAge = ageRepository.findById(id);
        Age age = optionalAge.orElseThrow(() -> new IllegalStateException("Age not found!"));

        age.setStatus(statusService.getAllStatuses().get(0));
        ageRepository.save(age);

        return AgeConverter.convertToAgeDTO(age, statusService.getAllStatuses().get(1));
    }
}
