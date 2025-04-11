package com.sept2024.parkinglot.services;

import com.sept2024.parkinglot.factory.SpotAssignmentStrategyFactory;
import com.sept2024.parkinglot.models.*;
import com.sept2024.parkinglot.repositories.GateRepository;
import com.sept2024.parkinglot.repositories.ParkingSpotRepository;
import com.sept2024.parkinglot.repositories.TicketRepository;
import com.sept2024.parkinglot.repositories.VehicleRepository;
import com.sept2024.parkinglot.strategies.SpotAssignmentStrategy;

import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private TicketRepository ticketRepository;
    private VehicleRepository vehicleRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public TicketService(GateRepository gateRepository, TicketRepository ticketRepository,
                         VehicleRepository vehicleRepository,
                         ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.ticketRepository = ticketRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber,
                              String ownerName, VehicleType vehicleType,
                              SpotAssignmentStrategyType type) {

        Ticket ticket = new Ticket();

        Optional<Gate> gate = gateRepository.findGateById(gateId);
        if(gate.isEmpty()) {
            // throw some error here
        }
//        ticket.setGate(gate.get());

        Optional<Vehicle> vehicle = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        if(vehicle.isEmpty()) {
            // throw some error here
        }
//        ticket.setVehicle(vehicle.get());

        SpotAssignmentStrategy spotStrategy = SpotAssignmentStrategyFactory.getSpotAssignmentStrategy(type);
        ParkingSpot parkingSpot = spotStrategy.assignSpot(vehicleType, gateId);
        ticket.setParkingSpot(parkingSpot);

        ticketRepository.save(ticket);


        return ticket;
    }
}
