package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.UnitConverter;
import com.github.dominaspl.aoewebservice.dtos.UnitDTO;
import com.github.dominaspl.aoewebservice.entities.Unit;
import com.github.dominaspl.aoewebservice.repositories.UnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitServiceImpl implements UnitService {

    private UnitRepository unitRepository;
    private StatusService statusService;

    public UnitServiceImpl(UnitRepository unitRepository, StatusService statusService) {
        this.unitRepository = unitRepository;
        this.statusService = statusService;
    }

    @Override
    public List<UnitDTO> getAllUnits() {

        List<Unit> allUnits = unitRepository.findByStatus(statusService.getAllStatuses().get(1));

        if (allUnits == null) {
            throw new IllegalStateException("Units not found!");
        }

        return UnitConverter.convertToUnitDTOList(allUnits);
    }

    @Override
    public UnitDTO findUnitById(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Unit> optionalUnit = unitRepository.findById(id);
        Unit unit = optionalUnit.orElseThrow(() -> new IllegalStateException("Unit not found!"));

        return UnitConverter.convertToUnitDTO(unit);

    }
}
