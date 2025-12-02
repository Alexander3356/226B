package ch.samt;

import ch.samt.enumerators.Sector;
import ch.samt.enumerators.State;
import ch.samt.models.*;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        TicketManager ticketManager = new TicketManager();

        Sector tribuna = Sector.TRIBUNA;
        Sector curva = Sector.CURVA;
        State disponibile = State.DISPONIBILE;
        State venduto = State.VENDUTO;

        ArrayList<EventTicket> ticketsList = new ArrayList<EventTicket>();
        ticketsList.add(new ConcertTicket("C001", "Rock Festival 2025", "15/06/2025", "Parco eventi", 101, disponibile, tribuna, "The Rolling Stones"));
        ticketsList.add(new ConcertTicket("C002", "Rock Festival 2025", "18/06/2025", "Arena concerti ", 201, disponibile, curva, "The Rolling Stones"));
        ticketsList.add(new ConcertTicket("C003", "Jazz Night", "20/07/2025", "Arena concerti ", 50, disponibile, tribuna, "Miles Davis Tribute"));
        ticketsList.add(new TheaterTicket("T001", "Serate alla Scala", "10/08/2025", "Teatro alla Scala", 15, disponibile, "Amleto", 3, false));
        ticketsList.add(new TheaterTicket("T002", "Serate alla Scala", "10/08/2025", "Teatro alla Scala", 25, disponibile, "Amleto", 8, true));
        ticketsList.add(new TheaterTicket("T003", "Riscopriamo il teatro", "05/09/2025", "Teatro comunale", 40, disponibile, "Amleto", 12, true));
        ticketsList.add(new TheaterTicket("T004", "Riscopriamo il teatro", "05/09/2025", "Teatro comunale", 41, disponibile, "Amleto", 12, false));
        ticketsList.add(new SportTicket("S001", "Serie A - Inter vs Milan", "25/09/2025", "Stadio San Siro", 150, disponibile, tribuna));
        ticketsList.add(new SportTicket("S002", "Serie A - Inter vs Milan", "25/09/2025", "Stadio San Siro", 250, disponibile, curva));
        ticketsList.add(new SportTicket("S003", "NBA Finals", "15/10/2025", "Madison Square Garden", 75, disponibile, tribuna));

        System.out.println("=== SISTEMA DI GESTIONE BIGLIETTERIA ===");
        System.out.println("\n--- TEST 1: Aggiunta di 10 biglietti al sistema ---");
        for (EventTicket ticket : ticketsList) {
            ticketManager.addTicket(ticket);
        }

        System.out.println("\n--- TEST 2: Stampa di tutti i biglietti ---");
        ticketManager.printTickets();

        System.out.println("\n--- TEST 3: Vendita di 5 biglietti ---");
        ticketManager.sellEventTicket("Jazz Night");
        ticketManager.sellEventTicket("Serate alla Scala");
        ticketManager.sellEventTicket("Rock Festival 2025");
        ticketManager.sellEventTicket("Serie A - Inter vs Milan");
        ticketManager.sellEventTicket("NBA Finals");

        System.out.println("\n--- TEST 4: NBA Finals - Biglietti terminati ---");
        ticketManager.sellEventTicket("NBA Finals");

        System.out.println("\n--- TEST 5: Lista dei biglietti ancora disponibili ---");
        ticketManager.availableTickets();

        System.out.println("\n--- TEST 6: Calcolo incasso totale ---");
        ticketManager.calculateTotalMoney();

        System.out.println("\n--- TEST 7: Biglietti per 'Rock Festival 2025' ---");
        ticketManager.ticketPerEventName("Rock Festival 2025");

        System.out.println("\n--- TEST 8: Biglietti ordinati per prezzo crescente ---");
        ticketManager.ticketPerPrice();

        System.out.println("\n--- TEST 9a: Tutti i biglietti per concerti ---");
        ticketManager.ticketPerEvent("CONCERTO");

        System.out.println("\n--- TEST 9b: Tutti i biglietti sportivi ---");
        ticketManager.ticketPerEvent("SPORT");

        System.out.println("\n--- TEST 10: Prezzo medio di tutti i biglietti  ---");
        ticketManager.averagePrice();

        //metodi polimorfici calculateTicketPrice(), getEventType()
        //metodi ereditati sellTicket(), isSold()

    }
}