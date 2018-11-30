package com.cognizant.ticket.service;

import com.cognizant.ticket.domain.Ticket;
import com.cognizant.ticket.utils.Validator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

class AccountNumberGenerator {
    @Value("${letter.first}")
    String firstLetter;
    @Value("${letter.second}")
    String secondLetter;
    @Value("${letter.third}")
    String thirdLetter;

    Ticket generateRandomAccountNumber(final int length) {
        StringBuilder accNumber = new StringBuilder();
        Ticket ticket;

        do {
            Random random = new Random();
            int prefix = random.nextInt(3);
            switch (prefix) {
                case 0:
                    accNumber.append(firstLetter);
                    break;
                case 1:
                    accNumber.append(secondLetter);
                    break;
                case 2:
                    accNumber.append(thirdLetter);
                    break;
                default:
                    // DO NOTHING
            }
            String suffix = RandomStringUtils.randomNumeric(length);
            accNumber.append(suffix);

        } while (Validator.validateAccountNumber(accNumber.toString()));
        ticket = new Ticket(accNumber.toString());

        return ticket;
    }
}
