package ch.samt.models;

import ch.samt.enumerators.Sector;
import ch.samt.enumerators.State;

import java.util.Objects;

public class TheaterTicket extends EventTicket {

    private String showTitle;
    private int row;
    private boolean studentDiscount;

    public TheaterTicket(String ticketCode, String eventName, String date, String place, int seatNumber, State state, String showTitle, int row, boolean studentDiscount) {
        super(ticketCode, eventName, date, place, seatNumber, state);
        this.showTitle = showTitle;
        this.row = row;
        this.studentDiscount = studentDiscount;
    }

    @Override
    public double calculateTicketPrice() {
        if (this.studentDiscount) {
            return 24.00;
        } else {
            return 30.00;
        }

    }

    @Override
    public String getEventType() {
        return "TEATRO";
    }

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(boolean studentDiscount) {
        this.studentDiscount = studentDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TheaterTicket that = (TheaterTicket) o;
        return row == that.row && studentDiscount == that.studentDiscount && Objects.equals(showTitle, that.showTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), showTitle, row, studentDiscount);
    }

    @Override
    public String toString() {
        return getEventType() + " - " + getEventName() + " | Spettacolo: " + getShowTitle() + " | Fila: " + getRow() + " | Prezzo: €" + calculateTicketPrice() ;
    }
}
