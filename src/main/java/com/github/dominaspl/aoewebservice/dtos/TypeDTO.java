package com.github.dominaspl.aoewebservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class TypeDTO {

    @JsonIgnore
    private Long typeId;

    @NotBlank
    @Size(min = 3, max = 20)
    private String typeName;


}
