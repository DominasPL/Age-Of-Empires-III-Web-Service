package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.entities.Age;

public class AgeConverter {

    public static AgeDTO convertToAgeDTO(Age age) {

        AgeDTO ageDTO = new AgeDTO();
        if (age == null) {
            ageDTO.setAgeName("");
        } else
            ageDTO.setAgeName(age.getAgeName());

        return ageDTO;
    }
}
