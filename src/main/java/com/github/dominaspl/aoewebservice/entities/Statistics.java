package com.github.dominaspl.aoewebservice.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stats_id")
    private Long statsId;

    @Column(nullable = false)
    private Integer hitPoints;

    @Column(nullable = false)
    private String resistance;

    @Column(nullable = false)
    private Double speed;

    @Column(nullable = false)
    private Double lineOfSight;

    private Integer population;

    private Double xpTrainBounty;

    private Double xpBounty;

}
