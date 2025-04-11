package com.sept2024.parkinglot.factory;

import com.sept2024.parkinglot.models.SpotAssignmentStrategyType;
import com.sept2024.parkinglot.strategies.CheapestSpotAssignmentStrategy;
import com.sept2024.parkinglot.strategies.RandomSpotAssignmentStrategy;
import com.sept2024.parkinglot.strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType type) {
        if(type.equals(SpotAssignmentStrategyType.CHEAP)) {
            return new CheapestSpotAssignmentStrategy();
        } else {
            return new RandomSpotAssignmentStrategy();
        }
    }
}
