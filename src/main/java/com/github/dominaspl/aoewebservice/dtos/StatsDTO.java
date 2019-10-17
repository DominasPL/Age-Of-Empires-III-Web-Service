package com.github.dominaspl.aoewebservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@RequiredArgsConstructor
public class StatsDTO {

    @JsonIgnore
    private Long statsId;

    @NotNull
    @Positive
    @Max(value = 10000)
    private Integer hitPoints;

    @NotNull
    private String resistance;

    @NotNull
    @Positive
    @Max(value = 30)
    private Double speed;

    @NotNull
    @Positive
    @Max(value = 150)
    private Double lineOfSight;

    @NotNull
    @Positive
    @Max(value = 10)
    private Integer population;

    private Double xpTrainBounty;

    private Double xpBounty;


}
