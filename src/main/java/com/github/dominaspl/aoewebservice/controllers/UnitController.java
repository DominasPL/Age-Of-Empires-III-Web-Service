package com.github.dominaspl.aoewebservice.controllers;

import com.github.dominaspl.aoewebservice.dtos.UnitDTO;
import com.github.dominaspl.aoewebservice.services.UnitService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@Validated
@RestController
@RequestMapping(UnitController.BASE_URL)
public class UnitController {

    public static final String BASE_URL = "/api/v1/aoe/units";

    private UnitService unitService;

    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UnitDTO> getAllUnits() {
        return unitService.getAllUnits();
    }

    @GetMapping(path = "/unit/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public UnitDTO getUnitById(@PathVariable("id") @Positive Long id) {
        return unitService.findUnitById(id);
    }

    @PostMapping(path = "/unit", produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public UnitDTO addUnit(@Valid @RequestBody UnitDTO unitDTO) {
        unitService.addNewUnit(unitDTO);
        return unitDTO;
    }

    @PutMapping(path = "/unit/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public UnitDTO updateUnit(@PathVariable("id") @Positive Long id, @Valid @RequestBody UnitDTO unitDTO) {
        unitService.updateUnitData(id, unitDTO);
        return unitDTO;
    }

    @DeleteMapping(path = "/unit/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public UnitDTO deleteUnit(@PathVariable("id") Long id) {
        return unitService.deleteUnit(id);
    }

}

