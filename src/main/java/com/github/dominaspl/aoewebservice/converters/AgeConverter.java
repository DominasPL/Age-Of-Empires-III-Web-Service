package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.entities.Age;

import java.util.ArrayList;
import java.util.List;

public class AgeConverter {

    public static AgeDTO convertToAgeDTO(Age age) {

        AgeDTO ageDTO = new AgeDTO();
        if (age == null) {
            ageDTO.setAgeName("");
        } else
            ageDTO.setAgeName(age.getAgeName());

        return ageDTO;
    }

    public static Age convertToAge(AgeDTO ageDTO) {

        Age age = new Age();
        age.setAgeId(ageDTO.getAgeId());
        age.setAgeName(ageDTO.getAgeName());
        return age;
    }

    public static List<AgeDTO> convertToAgeDTOList(List<Age> allAges) {

        List<AgeDTO> ageDTOList = new ArrayList<>();

        for (Age age : allAges) {
            AgeDTO ageDTO = new AgeDTO();
            ageDTO.setAgeId(age.getAgeId());
            ageDTO.setAgeName(age.getAgeName());
            ageDTOList.add(ageDTO);
        }

        return ageDTOList;
    }
}
