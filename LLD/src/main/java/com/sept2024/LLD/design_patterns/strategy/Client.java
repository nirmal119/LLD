package com.sept2024.LLD.design_patterns.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Delhi", "Agra", TravellingMethod.WALK);
    }
}
