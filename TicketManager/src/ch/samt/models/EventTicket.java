package ch.samt.models;

import ch.samt.enumerators.State;

import java.util.Objects;

public abstract class EventTicket implements Ticket {

    private String ticketCode;
    private String eventName;
    private String date;
    private String place;
    private int seatNumber;
    private State state;

    public EventTicket(String ticketCode, String eventName, String date, String place, int seatNumber, State state) {
        this.ticketCode = ticketCode;
        this.eventName = eventName;
        this.date = date;
        this.place = place;
        this.seatNumber = seatNumber;
        this.state = state;
    }

    @Override
    public double calculateTicketPrice() {
        return 0;
    }

    @Override
    public void sellTicket() {
        setState(State.VENDUTO);
        System.out.println("Biglietto " + ticketCode + " per " + eventName + " venduto con successo!");
    }

    @Override
    public String getEventType() {
        return null;
    }

    @Override
    public State isSold() {
        return state;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EventTicket that = (EventTicket) o;
        return seatNumber == that.seatNumber && Objects.equals(ticketCode, that.ticketCode) && Objects.equals(eventName, that.eventName) && Objects.equals(date, that.date) && Objects.equals(place, that.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketCode, eventName, date, place, seatNumber);
    }

    @Override
    public String toString() {
        return "EventTicket{" +
                "ticketCode='" + ticketCode + '\'' +
                ", eventName='" + eventName + '\'' +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                ", seatNumber=" + seatNumber +
                ", state=" + state +
                '}';
    }
}
