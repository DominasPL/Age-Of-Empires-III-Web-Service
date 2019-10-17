package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.StatsDTO;
import com.github.dominaspl.aoewebservice.entities.Statistics;

public class StatsConverter {


    public static StatsDTO convertToStatsDTO(Statistics statistics) {

        StatsDTO statsDTO = new StatsDTO();

        if (statistics != null) {
            statsDTO.setStatsId(statistics.getStatsId());
            statsDTO.setHitPoints(statistics.getHitPoints());
            statsDTO.setLineOfSight(statistics.getLineOfSight());
            statsDTO.setPopulation(statistics.getPopulation());
            statsDTO.setResistance(statistics.getResistance());
            statsDTO.setSpeed(statistics.getSpeed());
            statsDTO.setXpBounty(statistics.getXpBounty());
            statsDTO.setXpTrainBounty(statistics.getXpTrainBounty());
        }

        return statsDTO;
    }
}
