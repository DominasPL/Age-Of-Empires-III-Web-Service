package com.github.dominaspl.aoewebservice.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class AgeDTO {

    private Long ageId;

    @NotBlank
    @Size(min = 1, max = 5)
    private String ageName;

}
