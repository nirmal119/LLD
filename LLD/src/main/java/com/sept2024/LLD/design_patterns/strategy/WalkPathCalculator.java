package com.sept2024.LLD.design_patterns.strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Walking path");
    }
}
