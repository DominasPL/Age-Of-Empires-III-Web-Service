package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.AgeConverter;
import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.entities.Age;
import com.github.dominaspl.aoewebservice.repositories.AgeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgeServiceImpl implements AgeService {

    private AgeRepository ageRepository;

    public AgeServiceImpl(AgeRepository ageRepository) {
        this.ageRepository = ageRepository;
    }

    @Override
    public List<AgeDTO> getAllAges() {

        List<Age> allAges = ageRepository.findAll();

        if (allAges == null) {
            throw new IllegalStateException("Ages not found!");
        }

        return AgeConverter.convertToAgeDTOList(allAges);
    }
}
