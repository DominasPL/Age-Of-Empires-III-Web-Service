package com.github.dominaspl.aoewebservice.dtos;

import com.github.dominaspl.aoewebservice.entities.UnitInformation;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class UnitDTO {

    @NotBlank
    @Size(min = 3, max = 20)
    private String unitName;

    private UnitInformation unitInformation;

}
