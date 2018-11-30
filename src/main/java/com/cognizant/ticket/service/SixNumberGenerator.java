package com.cognizant.ticket.service;

import com.cognizant.ticket.domain.Ticket;

public class SixNumberGenerator extends AccountNumberGenerator implements IAccountGenerator {

    @Override
    public Ticket generator() {
        return generateRandomAccountNumber(NumberConstants.SIX_NUM_DIGITS);
    }
}
