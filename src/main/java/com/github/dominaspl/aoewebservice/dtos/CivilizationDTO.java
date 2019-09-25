package com.github.dominaspl.aoewebservice.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class CivilizationDTO {

    @NotBlank
    @Size(min = 3, max = 20)
    private String civilizationName;

}
