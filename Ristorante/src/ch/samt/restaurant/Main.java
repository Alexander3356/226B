package ch.samt.restaurant;

import ch.samt.food.*;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> toppingsMar = new ArrayList<>();
        toppingsMar.add("mozzarella");
        toppingsMar.add("pomodoro");
        toppingsMar.add("basilico");

        ArrayList<String> toppingsQua = new ArrayList<>();
        toppingsQua.add("mozzarella");
        toppingsQua.add("prosciutto");
        toppingsQua.add("funghi");
        toppingsQua.add("carciofi");
        toppingsQua.add("olive");

        RestaurantManager ristorante = new RestaurantManager();

        Pizza margherita = new Pizza("Margherita", 10, toppingsMar);
        Pizza quattroStagioni = new Pizza("Quattro Stagioni", 10, toppingsQua);
        Dessert tiramisu = new Dessert("Tiramisù", 5, false);
        Dessert pannaCotta = new Dessert("Panna Cotta", 5, true);
        Pasta arrabbiata = new Pasta("Arrabbiata", 9.6, true);
        Pasta carbonara = new Pasta("Carbonara", 9, false);

        ristorante.addMenuItem(margherita);
        ristorante.addMenuItem(quattroStagioni);
        ristorante.addMenuItem(tiramisu);
        ristorante.addMenuItem(pannaCotta);
        ristorante.addMenuItem(arrabbiata);
        ristorante.addMenuItem(carbonara);

        ristorante.stampaMenu();

        System.out.println("\n\n========== REGISTRAZIONE ORDINI ==========");
        ristorante.registraOrdine("Mario Rossi", margherita);
        ristorante.registraOrdine("Luca Bianchi", carbonara);
        ristorante.registraOrdine("Anna Verdi", quattroStagioni);
        ristorante.registraOrdine("Giovanni Neri", tiramisu);
        ristorante.registraOrdine("Andrea Viola", margherita);
        ristorante.registraOrdine("Sofia Arancio", carbonara);
        ristorante.registraOrdine("Matteo Verde", quattroStagioni);
        ristorante.registraOrdine("Mario Rossi", carbonara);

        ristorante.stampaStatistiche();
        ristorante.calcolaIncasso();


    }
}
