package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.UnitConverter;
import com.github.dominaspl.aoewebservice.dtos.UnitDTO;
import com.github.dominaspl.aoewebservice.entities.Unit;
import com.github.dominaspl.aoewebservice.repositories.UnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {

    private UnitRepository unitRepository;

    public UnitServiceImpl(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    @Override
    public List<UnitDTO> getAllUnits() {

        List<Unit> allUnits = unitRepository.findAll();

        if (allUnits == null) {
            throw new IllegalStateException("Units not found!");
        }

        return UnitConverter.convertToUnitDTOList(allUnits);
    }
}
