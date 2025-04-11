package com.sept2024.parkinglot.strategies;

import com.sept2024.parkinglot.models.ParkingSpot;
import com.sept2024.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Long gateId);
}
