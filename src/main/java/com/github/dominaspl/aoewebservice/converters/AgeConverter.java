package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.AgeDTO;
import com.github.dominaspl.aoewebservice.entities.Age;
import com.github.dominaspl.aoewebservice.entities.Status;

import java.util.ArrayList;
import java.util.List;

public class AgeConverter {

    public static AgeDTO convertToAgeDTO(Age age, Status status) {

        AgeDTO ageDTO = new AgeDTO();
        if (age == null) {
            ageDTO.setAgeName("");
        } else if (age.getStatus() == status) {
            ageDTO.setAgeName(age.getAgeName());
        }

        return ageDTO;
    }

    public static Age convertToAge(AgeDTO ageDTO, Status status) {

        Age age = new Age();
        age.setAgeId(ageDTO.getAgeId());
        age.setAgeName(ageDTO.getAgeName());
        age.setStatus(status);
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
