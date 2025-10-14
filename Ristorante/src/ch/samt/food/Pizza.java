package ch.samt.food;


import ch.samt.restaurant.MenuItem;

import java.util.ArrayList;
import java.util.Objects;

public class Pizza implements MenuItem {

    private String name;
    private double basePrice;
    private ArrayList<String> toppings = new ArrayList<String>();

    public Pizza(String name, double basePrice, ArrayList<String> toppings) {
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = toppings;
    }

    @Override
    public double calculatePrice() {
        double totalPrice = basePrice + toppings.size() * 0.5;
        return totalPrice;
    }

    @Override
    public String getDescription() {
        String description = "Pizza " + name + " con: ";
        for(String topping : toppings) {
            description += topping + ", ";
        }
        return description;
    }

    @Override
    public int getPreparationTime() {
        int totalTime = 18 + toppings.size();
        return totalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Double.compare(basePrice, pizza.basePrice) == 0 && Objects.equals(name, pizza.name) && Objects.equals(toppings, pizza.toppings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, basePrice, toppings);
    }

    @Override
    public String toString() {
        return "\n" + name.toUpperCase() + "\n" + getDescription() + "\nPrezzo: €" +
        calculatePrice() + "\nTempo preparazione: " + getPreparationTime();        
    }
}
