package com.sept2024.parkinglot.repositories;

import com.sept2024.parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private Map<Long, Ticket> ticketMap = new HashMap<>();
    private Long previousTicketid = 0L;

    public Ticket save(Ticket ticket) {
        if(ticket.getId() == null) {
            // new Ticket
            previousTicketid += 1;
            ticket.setId(previousTicketid);
            ticketMap.put(previousTicketid, ticket);
        }

        return ticket;
    }
}
