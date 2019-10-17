package com.github.dominaspl.aoewebservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

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
    @Size(min = 1, max = 30)
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

    @Range(min = 0, max = 1000)
    private Double xpTrainBounty;

    @Range(min = 0, max = 1000)
    private Double xpBounty;
}
