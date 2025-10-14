package ch.samt;

public abstract class MotorVehicle implements Vehicle {
    protected String brand;
    protected String model;
    protected FuelType fuelType;
    protected String currentDestination;

    // Attributes for vehicle monitoring
    protected double kmTraveled;
    protected boolean isMoving;

    public MotorVehicle(String brand, String model, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.kmTraveled = 0.0;
        this.isMoving = false;
    }

    @Override
    public void assignDestination(String destination) {
        this.currentDestination = destination;
        this.isMoving = true; // Vehicle starts moving towards destination
        System.out.println(brand + " " + model + " has been assigned to destination: " + destination);
        System.out.println("Status: Vehicle is in motion.");
    }

    public void completeTrip(double tripDistance) {
        this.kmTraveled += tripDistance;
        this.isMoving = false; // Vehicle arrived at destination
        System.out.printf("Arrived at destination. Total km traveled: %.2f km.\n", this.kmTraveled);
        System.out.println("Status: Vehicle is stationary.");
    }


}