package com.github.dominaspl.aoewebservice.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class UnitInformationDTO {

    private List<TypeDTO> types = new ArrayList<>();

    private List<CivilizationDTO> civilizations = new ArrayList<>();

    private AgeDTO age;

}
