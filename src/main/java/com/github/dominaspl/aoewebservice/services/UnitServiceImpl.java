package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.UnitConverter;
import com.github.dominaspl.aoewebservice.converters.UnitInformationConverter;
import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.dtos.TypeDTO;
import com.github.dominaspl.aoewebservice.dtos.UnitDTO;
import com.github.dominaspl.aoewebservice.entities.Unit;
import com.github.dominaspl.aoewebservice.repositories.UnitInformationRepository;
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
    private UnitInformationRepository unitInformationRepository;


    public UnitServiceImpl(UnitRepository unitRepository, StatusService statusService, TypeService typeService, CivilizationService civilizationService, AgeService ageService, UnitInformationRepository unitInformationRepository) {
        this.unitRepository = unitRepository;
        this.statusService = statusService;
        this.typeService = typeService;
        this.civilizationService = civilizationService;
        this.ageService = ageService;
        this.unitInformationRepository = unitInformationRepository;
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

    @Override
    @Transactional
    public void addNewUnit(UnitDTO unitDTO) {

        if (unitDTO == null) {
            throw new IllegalArgumentException("Unit must be given!");
        }

        AgeDTO ageDTO = checkAgeInDatabase(unitDTO.getUnitInformation().getAge());
        Set<TypeDTO> filteredTypes = checkTypesInDatabase(unitDTO.getUnitInformation().getTypes());
        Set<CivilizationDTO> filteredCivilizations = checkCivilizationInDatabase(unitDTO.getUnitInformation().getCivilizations());

        Unit unit = UnitConverter.convertToUnit(unitDTO.getUnitName(),
                ageDTO,
                filteredTypes,
                filteredCivilizations,
                statusService.getAllStatuses().get(1)
        );

        unitRepository.save(unit);
    }

    @Override
    public void updateUnitData(Long id, UnitDTO unitDTO) {

        if (id == null || unitDTO == null) {
            throw new IllegalArgumentException("Incorrect values!");
        }

        Optional<Unit> optionalUnit = unitRepository.findById(id);
        Unit unit = optionalUnit.orElse(null);
        if (unit == null) {
            addNewUnit(unitDTO);
        } else {
            unit.setUnitName(unitDTO.getUnitName());
            unit.setUnitInformation(UnitInformationConverter.convertToUnitInformation(
                    checkAgeInDatabase(unitDTO.getUnitInformation().getAge()),
                    checkTypesInDatabase(unitDTO.getUnitInformation().getTypes()),
                    checkCivilizationInDatabase(unitDTO.getUnitInformation().getCivilizations()),
                    unit.getStatus()
            ));
            unit.getUnitInformation().setUnitInformationId(id);
            unitRepository.save(unit);
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

        return UnitConverter.convertToUnitDTO(unit);
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
