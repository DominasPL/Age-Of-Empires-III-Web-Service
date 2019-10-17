package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.UnitConverter;
import com.github.dominaspl.aoewebservice.converters.UnitInformationConverter;
import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.dtos.TypeDTO;
import com.github.dominaspl.aoewebservice.dtos.UnitDTO;
import com.github.dominaspl.aoewebservice.entities.Status;
import com.github.dominaspl.aoewebservice.entities.Unit;
import com.github.dominaspl.aoewebservice.entities.UnitInformation;
import com.github.dominaspl.aoewebservice.repositories.UnitRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UnitServiceImpl implements UnitService {

    private UnitRepository unitRepository;
    private StatusService statusService;
    private TypeService typeService;
    private CivilizationService civilizationService;
    private AgeService ageService;

    public UnitServiceImpl(UnitRepository unitRepository, StatusService statusService, TypeService typeService, CivilizationService civilizationService, AgeService ageService) {
        this.unitRepository = unitRepository;
        this.statusService = statusService;
        this.typeService = typeService;
        this.civilizationService = civilizationService;
        this.ageService = ageService;
    }

    @Override
    public List<UnitDTO> getAllUnits() {

        List<Unit> allUnits = unitRepository.findByStatus(statusService.getAllStatuses().get(1));

        if (allUnits == null) {
            throw new IllegalStateException("Units not found!");
        }

        return UnitConverter.convertToUnitDTOList(allUnits, statusService.getAllStatuses().get(1));
    }

    @Override
    public UnitDTO findUnitById(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Unit> optionalUnit = unitRepository.findByUnitIdAndStatus(id, statusService.getAllStatuses().get(1));
        Unit unit = optionalUnit.orElseThrow(() -> new IllegalStateException("Unit not found!"));

        return UnitConverter.convertToUnitDTO(unit, statusService.getAllStatuses().get(1));

    }

    @Override
    @Transactional
    public void addNewUnit(UnitDTO unitDTO) {

        if (unitDTO == null) {
            throw new IllegalArgumentException("Unit must be given!");
        }

        Optional<Unit> optionalUnit = unitRepository.findByUnitName(unitDTO.getUnitName());
        Unit unit = optionalUnit.orElse(null);
        Status status = statusService.getAllStatuses().get(1);

        if (unit == null) {
            unit = setUnitData(unitDTO);
            unitRepository.save(unit);
        } else if (unit.getStatus() != status) {
            Long unitId = unit.getUnitId();
            unit = setUnitData(unitDTO);
            UnitInformation unitInformation = unit.getUnitInformation();
            unitInformation.setUnitInformationId(unitId);
            unit.setStatus(status);
            unit.setUnitId(unitId);
            unitRepository.save(unit);
        } else {
            throw new IllegalStateException("Unit already exists!");
        }
    }

    private Unit setUnitData(UnitDTO unitDTO) {
        Unit unit;
        unit = UnitConverter.convertToUnit(unitDTO.getUnitName(),
                checkAgeInDatabase(unitDTO.getUnitInformation().getAge()),
                checkTypesInDatabase(unitDTO.getUnitInformation().getTypes()),
                checkCivilizationInDatabase(unitDTO.getUnitInformation().getCivilizations()),
                unitDTO.getUnitInformation().getStats(),
                statusService.getAllStatuses().get(1)
        );

        return unit;
    }

    @Override
    public void updateUnitData(Long id, UnitDTO unitDTO) {

        if (id == null || unitDTO == null) {
            throw new IllegalArgumentException("Incorrect values!");
        }

        Optional<Unit> optionalUnit = unitRepository.findById(id);
        Unit unit = optionalUnit.orElse(null);
        Status status = statusService.getAllStatuses().get(1);

        if (unit == null) {
            addNewUnit(unitDTO);
        } else if (unit.getStatus() == status) {
            unit.setUnitName(unitDTO.getUnitName());
            unit.setUnitInformation(UnitInformationConverter.convertToUnitInformation(
                    checkAgeInDatabase(unitDTO.getUnitInformation().getAge()),
                    checkTypesInDatabase(unitDTO.getUnitInformation().getTypes()),
                    checkCivilizationInDatabase(unitDTO.getUnitInformation().getCivilizations()),
                    unitDTO.getUnitInformation().getStats(),
                    unit.getStatus()
            ));
            unit.getUnitInformation().setUnitInformationId(id);
            unitRepository.save(unit);
        } else {
            throw new IllegalStateException("Unit not found!");
        }
    }

    @Override
    public UnitDTO deleteUnit(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Unit> optionalUnit = unitRepository.findById(id);
        Unit unit = optionalUnit.orElseThrow(() -> new IllegalStateException("User not found!"));

        unit.setStatus(statusService.getAllStatuses().get(0));
        unitRepository.save(unit);

        return UnitConverter.convertToUnitDTO(unit, statusService.getAllStatuses().get(1));
    }

    public Set<TypeDTO> checkTypesInDatabase(List<TypeDTO> typeDTOList) {

        List<TypeDTO> allTypes = typeService.findAllTypes();
        Set<TypeDTO> filteredSet = new HashSet<>();

        for (TypeDTO typeDTO : allTypes) {

            for (TypeDTO typeDTO1 : typeDTOList) {
                if (typeDTO.getTypeName().equalsIgnoreCase(typeDTO1.getTypeName())) {
                    filteredSet.add(typeDTO);
                }
            }

        }

        if (filteredSet.isEmpty()) {
            throw new IllegalArgumentException("Types can't be empty!");
        }

        return filteredSet;
    }

    public Set<CivilizationDTO> checkCivilizationInDatabase(List<CivilizationDTO> civilizations) {

        List<CivilizationDTO> allCivilizations = civilizationService.getAllCivilizations();
        Set<CivilizationDTO> filteredSet = new HashSet<>();

        for (CivilizationDTO civilizationDTO : allCivilizations) {

            for (CivilizationDTO civilizationDTO1 : civilizations) {
                if (civilizationDTO.getCivilizationName().equalsIgnoreCase(civilizationDTO1.getCivilizationName())) {
                    filteredSet.add(civilizationDTO);
                }
            }

        }

        if (filteredSet.isEmpty()) {
            throw new IllegalArgumentException("Civilizations can't be empty!");
        }

        return filteredSet;
    }

    public AgeDTO checkAgeInDatabase(AgeDTO age) {

        List<AgeDTO> allAges = ageService.getAllAges();

        for (AgeDTO ageDTO : allAges) {
            if (ageDTO.getAgeName().equalsIgnoreCase(age.getAgeName())){
                age = ageDTO;
            }
        }

        if (age.getAgeId() == null) {
            throw new IllegalArgumentException("Given age is not correct!");
        }

        return age;
    }
}
