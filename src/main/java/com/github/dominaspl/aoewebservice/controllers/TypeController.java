package com.github.dominaspl.aoewebservice.controllers;

import com.github.dominaspl.aoewebservice.dtos.TypeDTO;
import com.github.dominaspl.aoewebservice.services.TypeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(TypeController.BASE_URL)
public class TypeController {

    public final static String BASE_URL = "/api/v1/aoe/types";

    private TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping(produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public List<TypeDTO> getAllTypes() {
        return typeService.findAllTypes();
    }

    @GetMapping(value = "/type/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public TypeDTO getTypeById(@PathVariable("id") Long id) {
        return typeService.findById(id);
    }
}
