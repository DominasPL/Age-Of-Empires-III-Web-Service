package com.github.dominaspl.aoewebservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;

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

    @DecimalMin("0.0")
    @DecimalMax("1000.0")
    private Double xpTrainBounty;

    @DecimalMin("0.0")
    @DecimalMax("1000.0")
    private Double xpBounty;
    
}
