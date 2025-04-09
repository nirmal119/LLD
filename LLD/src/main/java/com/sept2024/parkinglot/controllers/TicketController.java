package com.sept2024.parkinglot.controllers;

import com.sept2024.parkinglot.dtos.IssueTicketRequestDto;
import com.sept2024.parkinglot.dtos.IssueTicketResponseDto;
import com.sept2024.parkinglot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto) {



        return null;
    }
}
