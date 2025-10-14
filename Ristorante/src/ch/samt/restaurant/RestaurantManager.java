package ch.samt.restaurant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RestaurantManager {
    private Map<MenuItem, Integer> ordini = new HashMap<>();
    private HashSet<MenuItem> menu = new HashSet<>();

    public void addMenuItem(MenuItem MenuItem) {
        menu.add(MenuItem);
    }

    public void stampaMenu() {
        System.out.println("============= MENU DEL RISTORANTE =============");
        for (MenuItem item : menu) {
            System.out.println(item.toString());
        }
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
