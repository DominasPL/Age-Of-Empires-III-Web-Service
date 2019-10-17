package com.github.dominaspl.aoewebservice.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class UnitInformationDTO {

    @Valid
    private List<TypeDTO> types = new ArrayList<>();

    @Valid
    private List<CivilizationDTO> civilizations = new ArrayList<>();

    @Valid
    private AgeDTO age;

    @Valid
    private StatsDTO stats;

}
