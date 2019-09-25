package com.github.dominaspl.aoewebservice.controllers;

import com.github.dominaspl.aoewebservice.dtos.CivilizationDTO;
import com.github.dominaspl.aoewebservice.services.CivilizationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(CivilizationController.BASE_URL)
public class CivilizationController {

    public static final String BASE_URL = "/api/v1/aoe";

    private CivilizationService civilizationService;

    public CivilizationController(CivilizationService civilizationService) {
        this.civilizationService = civilizationService;
    }

    @GetMapping(path = "/civs", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public List<CivilizationDTO> getAllCivilizations() {
        return civilizationService.getAllCivilizations();
    }

}
