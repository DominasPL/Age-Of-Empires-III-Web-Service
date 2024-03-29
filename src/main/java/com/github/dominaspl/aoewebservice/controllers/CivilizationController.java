package com.github.dominaspl.aoewebservice.controllers;

import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.services.CivilizationService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@Validated
@RestController
@RequestMapping(CivilizationController.BASE_URL)
public class CivilizationController {

    public static final String BASE_URL = "/api/v1/aoe/civilizations";

    private CivilizationService civilizationService;

    public CivilizationController(CivilizationService civilizationService) {
        this.civilizationService = civilizationService;
    }

    @GetMapping(produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public List<CivilizationDTO> getAllCivilizations() {
        return civilizationService.getAllCivilizations();
    }

    @GetMapping(path = "/civilization/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public CivilizationDTO getCivilizationById(@PathVariable("id") @Positive Long id) {
        return civilizationService.getCivilizationById(id);
    }

    @PostMapping(path = "/civilization", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public CivilizationDTO addCivilization(@Valid @RequestBody CivilizationDTO civilizationDTO) {
        civilizationService.addNewCivilization(civilizationDTO);
        return civilizationDTO;
    }

    @PutMapping(path = "/civilization/{id}", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public CivilizationDTO updateCivilization(@Valid @RequestBody CivilizationDTO civilizationDTO, @PathVariable("id") @Positive Long id) {
        civilizationService.updateCivilization(civilizationDTO, id);
        return civilizationDTO;
    }

    @DeleteMapping(path = "/civilization/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public CivilizationDTO deleteCivilization(@PathVariable("id") @Positive Long id) {
        return civilizationService.deleteCivilization(id);
    }


}
