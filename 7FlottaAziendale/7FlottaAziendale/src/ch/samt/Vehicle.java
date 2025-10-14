package ch.samt;

public interface Vehicle {
    void assignDestination(String destination);
    void calculateFuelCost(double distanceKm);
    void completeTrip(double tripDistance);
}