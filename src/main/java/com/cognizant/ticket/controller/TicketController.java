package com.cognizant.ticket.controller;

import com.cognizant.ticket.domain.Ticket;
import com.cognizant.ticket.service.IAccountGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("${url.base}")
public class TicketController {

    @Autowired
    IAccountGenerator ticketService;

    @GetMapping()
    public Ticket generateTicket() {
        return ticketService.generator();
    }
}
