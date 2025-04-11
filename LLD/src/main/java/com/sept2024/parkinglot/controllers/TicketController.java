package com.sept2024.parkinglot.controllers;

import com.sept2024.parkinglot.dtos.IssueTicketRequestDto;
import com.sept2024.parkinglot.dtos.IssueTicketResponseDto;
import com.sept2024.parkinglot.dtos.ResponseStatus;
import com.sept2024.parkinglot.models.SpotAssignmentStrategyType;
import com.sept2024.parkinglot.models.Ticket;
import com.sept2024.parkinglot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto) {

        Ticket ticket = ticketService.issueTicket(issueTicketRequestDto.getGateId(),
                issueTicketRequestDto.getVehicleNumber(),
                issueTicketRequestDto.getVehicleOwnerName(),
                issueTicketRequestDto.getVehicleType(),
                SpotAssignmentStrategyType.RANDOM);

        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
        responseDto.setTicket(ticket);
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        return responseDto;
    }
}
