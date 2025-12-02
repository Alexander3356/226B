package ch.samt.models;

import ch.samt.enumerators.Sector;
import ch.samt.enumerators.State;

import java.util.Objects;

public class ConcertTicket extends EventTicket {

    private Sector sector;
    private String mainArtist;

    public ConcertTicket(String ticketCode, String eventName, String date, String place, int seatNumber, State state, Sector sector, String mainArtist) {
        super(ticketCode, eventName, date, place, seatNumber, state);
        this.sector = sector;
        this.mainArtist = mainArtist;
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
        return "CONCERTO";
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(String mainArtist) {
        this.mainArtist = mainArtist;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConcertTicket that = (ConcertTicket) o;
        return sector == that.sector && Objects.equals(mainArtist, that.mainArtist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sector, mainArtist);
    }

    @Override
    public String toString() {
        return getEventType() + " - " + getEventName() + " | Artista: " + getMainArtist() + " | Settore: " + getSector() + " | Prezzo: €" + calculateTicketPrice() ;
    }
}
