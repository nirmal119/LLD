package com.sept2024.LLD.design_patterns.strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorForMode(TravellingMethod mode) {
        return switch (mode) {
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}
