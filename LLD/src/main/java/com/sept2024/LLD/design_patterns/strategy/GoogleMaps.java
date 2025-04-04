package com.sept2024.LLD.design_patterns.strategy;

public class GoogleMaps {

    PathCalculatorStrategy pathCalculatorStrategy;

    public void findPath(String from, String to, TravellingMethod mode) {

        pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorForMode(mode);
        pathCalculatorStrategy.findPath(to, from);
    }
}
