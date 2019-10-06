package com.github.dominaspl.aoewebservice.controllers;

import com.github.dominaspl.aoewebservice.dtos.UnitDTO;
import com.github.dominaspl.aoewebservice.services.UnitService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.util.List;

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

}

