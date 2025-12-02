package ch.samt.models;

import ch.samt.enumerators.Sector;
import ch.samt.enumerators.State;

import java.util.Objects;

public class SportTicket extends EventTicket {

    private Sector sector;

    public SportTicket(String ticketCode, String eventName, String date, String place, int seatNumber, State state, Sector sector) {
        super(ticketCode, eventName, date, place, seatNumber, state);
        this.sector = sector;
    }

    @Override
    public double calculateTicketPrice() {
        if (sector == Sector.CURVA) {
            return 20.0;
        } else {
            return 40.0;
        }
    }

    @Override
    public String getEventType() {
        return "SPORT";
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportTicket that = (SportTicket) o;
        return sector == that.sector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sector);
    }

    @Override
    public String toString() {
        return getEventType() + " - " + getEventName() + " | Evento: " + getEventName() + " | Settore: " + getSector() + " | Posto: " + getSeatNumber() + " | Prezzo: €" + calculateTicketPrice();
    }
}
