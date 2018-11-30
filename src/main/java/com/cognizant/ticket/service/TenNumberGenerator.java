package com.cognizant.ticket.service;

import com.cognizant.ticket.domain.Ticket;

import static com.cognizant.ticket.service.NumberConstants.TEN_NUM_DIGITS;

public class TenNumberGenerator extends AccountNumberGenerator implements IAccountGenerator {

    @Override
    public Ticket generator() {
        return generateRandomAccountNumber(TEN_NUM_DIGITS);
    }
}
