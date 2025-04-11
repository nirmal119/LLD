package com.sept2024.parkinglot.repositories;

import com.sept2024.parkinglot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {

    private Map<String, Vehicle> gateVehicle = new HashMap<>();

    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber) {
        if(gateVehicle.containsKey(vehicleNumber)) {
            return Optional.of(gateVehicle.get(vehicleNumber));
        }
        return Optional.empty();
    }
}
