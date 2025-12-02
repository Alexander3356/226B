package ch.samt.models;

import ch.samt.enumerators.State;

public interface Ticket {

    double calculateTicketPrice();

    void sellTicket();

    String getEventType();

    State isSold();

}
