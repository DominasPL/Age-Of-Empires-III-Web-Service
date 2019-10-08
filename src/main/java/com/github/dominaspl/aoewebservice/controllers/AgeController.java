package com.github.dominaspl.aoewebservice.controllers;

import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.services.AgeService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@Validated
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


    @GetMapping("/age/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AgeDTO getAgeById(@Valid @Positive @PathVariable("id") Long id) {
        return ageService.findById(id);
    }

    @PostMapping(path = "/age", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public AgeDTO addNewAge(@Valid @RequestBody AgeDTO ageDTO) {
        ageService.addNewAge(ageDTO);
        return ageDTO;
    }

    @PutMapping(path = "/age/{id}", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public AgeDTO updateAgeData(@PathVariable("id") @Positive Long id, @Valid @RequestBody AgeDTO ageDTO) {
        ageService.updateAge(id, ageDTO);
        return ageDTO;
    }

    @DeleteMapping(path = "/age/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public AgeDTO deleteAge(@PathVariable("id") @Positive Long id) {
        return ageService.deleteAge(id);
    }

}
