package ch.samt.food;


import ch.samt.restaurant.MenuItem;

import java.util.Objects;

public class Pasta implements MenuItem {

    private String name;
    private double price;
    private boolean isGlutenFree;

    public Pasta(String name, double price, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public String getDescription() {
        String descrizione = "Pasta " + name;
        if (isGlutenFree) {
            descrizione += " (senza glutine)";
        }
        return descrizione;
    }

    @Override
    public int getPreparationTime() {
        return 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pasta pasta = (Pasta) o;
        return Double.compare(price, pasta.price) == 0 && isGlutenFree == pasta.isGlutenFree && Objects.equals(name, pasta.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, isGlutenFree);
    }

    @Override
    public String toString() {
        return "\n" + name.toUpperCase() + "\n" + getDescription() + "\nPrezzo: €" +
        calculatePrice() + "\nTempo preparazione: " + getPreparationTime();
    }
}
