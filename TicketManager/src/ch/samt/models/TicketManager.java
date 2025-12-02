package ch.samt.models;

import ch.samt.enumerators.State;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class TicketManager {

    private ArrayList<EventTicket> tickets = new ArrayList<>();

    public void addTicket(EventTicket ticket) {
        tickets.add(ticket);
        System.out.println("Aggiunto biglietto con codice " + ticket.getTicketCode() + " per evento " + ticket.getEventName());
    }

    public void printTickets() {
        for (EventTicket ticket : tickets) {
            System.out.println("Codice: " + ticket.getTicketCode() +
                    " | Evento: " + ticket.getEventName() +
                    " | Data: " + ticket.getDate() +
                    " | Luogo: " + ticket.getPlace() +
                    " | Posto: " + ticket.getSeatNumber() +
                    " | Prezzo: " + ticket.calculateTicketPrice() +
                    " | Stato: " + ticket.isSold());
        }
    }

    public void sellEventTicket(String name) {
        boolean noTickets = true;
        for (EventTicket ticket : tickets) {
            if (ticket.getEventName().equals(name) && ticket.isSold().equals(State.DISPONIBILE)){
                ticket.sellTicket();
                noTickets = false;
                break;
            }
        }
        if (noTickets) {
            System.out.println("Sono terminati i biglietti per " + name);
        }
    }

    public void availableTickets() {
        int count = 0;
        ArrayList<EventTicket> tickets2 = tickets;
        for (EventTicket ticket : tickets) {
            if(ticket.isSold().equals(State.DISPONIBILE)){
                count++;
            }
        }
        System.out.println("Numero di biglietti disponibili: " + count);
        tickets2.stream()
                .filter(t -> t.isSold().equals(State.DISPONIBILE))
                .forEach(t -> System.out.println(t.toString()));

    }

    public void calculateTotalMoney() {
        double money = 0;
        for(EventTicket ticket : tickets){
            if(ticket.isSold().equals(State.DISPONIBILE)){
                money += ticket.calculateTicketPrice();
            }
        }
        System.out.println("Incasso totale da biglietti venduti: €" + money);
    }

    public void ticketPerEventName(String name) {
        ArrayList<EventTicket> tickets2 = tickets;
        tickets2.stream()
                .filter(t -> t.getEventName().equals(name))
                .forEach(t -> System.out.println(t.toString()));
    }

    public void ticketPerPrice() {
        ArrayList<EventTicket> tickets2 = tickets;
        tickets2.sort(Comparator.comparingDouble(EventTicket::calculateTicketPrice));
        for(EventTicket ticket : tickets2){
            System.out.println(ticket.toString());
        }
    }

    public void ticketPerEvent(String name) {
        ArrayList<EventTicket> tickets2 = tickets;
        tickets2.stream()
                .filter(t -> t.getEventType().equals(name))
                .forEach(t -> System.out.println(t.toString()));
    }

    public void averagePrice() {
        double money = 0;
        int count = 0;
        for(EventTicket ticket : tickets){
            money += ticket.calculateTicketPrice();
            count++;
        }
        System.out.println("Prezzo medio: €" + money/count);
    }

}
