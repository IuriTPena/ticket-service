package com.cognizant.ticket.service;

import com.cognizant.ticket.domain.Ticket;

import static com.cognizant.ticket.service.NumberConstants.EIGHT_NUM_DIGITS;

public class EightNumberGenerator extends AccountNumberGenerator implements IAccountGenerator {

    @Override
    public Ticket generator() {
        return generateRandomAccountNumber(EIGHT_NUM_DIGITS);
    }
}
