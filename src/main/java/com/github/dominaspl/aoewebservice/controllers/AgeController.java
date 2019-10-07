package com.github.dominaspl.aoewebservice.controllers;

import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.services.AgeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(AgeController.BASE_URL)
public class AgeController {

    public final static String BASE_URL = "/api/v1/aoe/ages";

    private AgeService ageService;

    public AgeController(AgeService ageService) {
        this.ageService = ageService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AgeDTO> getAllAges() {
        return ageService.getAllAges();
    }

}
