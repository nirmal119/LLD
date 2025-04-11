package com.sept2024.parkinglot;

import com.sept2024.parkinglot.controllers.TicketController;
import com.sept2024.parkinglot.dtos.IssueTicketRequestDto;
import com.sept2024.parkinglot.dtos.IssueTicketResponseDto;
import com.sept2024.parkinglot.models.Ticket;
import com.sept2024.parkinglot.models.VehicleType;
import com.sept2024.parkinglot.repositories.GateRepository;
import com.sept2024.parkinglot.repositories.ParkingSpotRepository;
import com.sept2024.parkinglot.repositories.TicketRepository;
import com.sept2024.parkinglot.repositories.VehicleRepository;
import com.sept2024.parkinglot.services.TicketService;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        // Create a ticket

        GateRepository gateRepository = new GateRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setVehicleOwnerName("Naruto");
        requestDto.setEntryTime(new Date());
        requestDto.setVehicleNumber("ABCDF");
        requestDto.setGateId(11L);
        requestDto.setVehicleType(VehicleType.SUV);

        TicketService ticketService = new TicketService(gateRepository, ticketRepository,
                vehicleRepository, parkingSpotRepository);
        TicketController ticketController = new TicketController(ticketService);


        // Issue a ticket using a controller

        IssueTicketResponseDto issueTicketResponseDto = ticketController.issueTicket(requestDto);
        System.out.println(issueTicketResponseDto.getTicket().getId());
    }
}
