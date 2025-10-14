package ch.samt.restaurant;

import ch.samt.food.Pizza;

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

        ristorante.addMenuItem(new Pizza("Margherita", 10, toppingsMar));
        ristorante.addMenuItem(new Pizza("Quattro stagioni", 10, toppingsQua));

        ristorante.stampaMenu();


    }
}
