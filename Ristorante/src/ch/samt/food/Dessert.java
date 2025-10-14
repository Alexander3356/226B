package ch.samt.food;

import ch.samt.restaurant.MenuItem;

import java.util.Objects;

public class Dessert implements MenuItem {

    private String name;
    private double basePrice;
    private boolean hasExtraTopping;

    public Dessert(String name, double basePrice, boolean hasExtraTopping) {
        this.name = name;
        this.basePrice = basePrice;
        this.hasExtraTopping = hasExtraTopping;
    }

    @Override
    public double calculatePrice() {
        double totalPrice = basePrice;
        if (hasExtraTopping) {
            totalPrice += 1.5;
        }
        return totalPrice;
    }

    @Override
    public String getDescription() {
        return "Dessert " + name;
    }

    @Override
    public int getPreparationTime() {
        return 5;
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

    public boolean isHasExtraTopping() {
        return hasExtraTopping;
    }

    public void setHasExtraTopping(boolean hasExtraTopping) {
        this.hasExtraTopping = hasExtraTopping;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dessert dessert = (Dessert) o;
        return Double.compare(basePrice, dessert.basePrice) == 0 && hasExtraTopping == dessert.hasExtraTopping && Objects.equals(name, dessert.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, basePrice, hasExtraTopping);
    }

    @Override
    public String toString() {
        return "\n" + name.toUpperCase() + "\n" + getDescription() + "\nPrezzo: €" +
        calculatePrice() + "\nTempo preparazione: " + getPreparationTime();
    }


}
