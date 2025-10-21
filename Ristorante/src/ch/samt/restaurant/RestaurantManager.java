package ch.samt.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import ch.samt.food.*;
import java.util.*;

public class RestaurantManager {

    private Map<MenuItem, Integer> ordini = new HashMap<>();
    private HashSet<MenuItem> menu = new HashSet<>();
    private HashMap<String, ArrayList<MenuItem>> ordiniClienti = new HashMap<>();
    private HashSet<String> clientiUnici = new HashSet<>();

    public void addMenuItem(MenuItem MenuItem) {
        menu.add(MenuItem);
    }

    public void stampaMenu() {
        System.out.println("============= MENU DEL RISTORANTE =============");
        for (MenuItem item : menu) {
            System.out.println(item.toString());
        }
    }

    public void registraOrdine(String nomeCliente, MenuItem item) {
        clientiUnici.add(nomeCliente);

        ArrayList<MenuItem> lista;
        if (ordiniClienti.containsKey(nomeCliente)) {
            lista = ordiniClienti.get(nomeCliente);
        } else {
            lista = new ArrayList<>();
        }

        lista.add(item);
        ordiniClienti.put(nomeCliente, lista);

        if (ordini.containsKey(item)) {
            ordini.put(item, ordini.get(item) + 1);
        } else {
            ordini.put(item, 1);
        }

        String nomePiatto = "";
        if (item instanceof Pizza) {
            nomePiatto = ((Pizza) item).getName();
        } else if (item instanceof Pasta) {
            nomePiatto = ((Pasta) item).getName();
        } else if (item instanceof Dessert) {
            nomePiatto = ((Dessert) item).getName();
        }

        System.out.println("Ordine registrato: " + nomeCliente + " - " + nomePiatto);
    }

    public void stampaStatistiche() {
        System.out.println("\n========== STATISTICHE GIORNALIERE ==========");
        System.out.println("Clienti unici oggi: " + clientiUnici.size());
        System.out.println("\nClienti:");
        for (String nome : clientiUnici) {
            System.out.println("  - " + nome);
        }

        MenuItem piattoPiuPopolare = null;
        int maxOrdini = 0;

        for (Map.Entry<MenuItem, Integer> entry : ordini.entrySet()) {
            if (entry.getValue() > maxOrdini) {
                maxOrdini = entry.getValue();
                piattoPiuPopolare = entry.getKey();
            }
        }

        double sommaTempi = 0;
        int totalePiatti = 0;

        for (Map.Entry<MenuItem, Integer> entry : ordini.entrySet()) {
            sommaTempi += entry.getKey().getPreparationTime() * entry.getValue();
            totalePiatti += entry.getValue();
        }

        double media = sommaTempi / totalePiatti;

        String nomePiattoPopolare = "";
        if (piattoPiuPopolare instanceof Pizza) {
            nomePiattoPopolare = ((Pizza) piattoPiuPopolare).getName();
        } else if (piattoPiuPopolare instanceof Pasta) {
            nomePiattoPopolare = ((Pasta) piattoPiuPopolare).getName();
        } else if (piattoPiuPopolare instanceof Dessert) {
            nomePiattoPopolare = ((Dessert) piattoPiuPopolare).getName();
        }

        System.out.println("\nPiatto più popolare: " + nomePiattoPopolare + " (" + maxOrdini + " ordini)");
        System.out.println("Tempo medio di preparazione: " + String.format("%.2f", media) + " minuti");
        System.out.println("=============================================");
    }

    public void calcolaIncasso() {
        double totale = 0;
        for (Map.Entry<MenuItem, Integer> entry : ordini.entrySet()) {
            totale += entry.getKey().calculatePrice() * entry.getValue();
        }
        System.out.println("\nFATTURATO TOTALE: €" + String.format("%.2f", totale));
    }

    public Map<MenuItem, Integer> getOrdini() {
        return ordini;
    }

    public void setOrdini(Map<MenuItem, Integer> ordini) {
        this.ordini = ordini;
    }

    public HashSet<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(HashSet<MenuItem> menu) {
        this.menu = menu;
    }
}
