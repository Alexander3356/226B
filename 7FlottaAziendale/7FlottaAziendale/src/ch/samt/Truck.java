package ch.samt;

public class Truck extends MotorVehicle {
    private static final double DIESEL_PRICE_PER_LITER = 1.70;
    private static final double CONSUMPTION_KM_PER_LITER = 4.0;

    public Truck(String brand, String model, FuelType fuelType) {
        super(brand, model, fuelType);
    }

    @Override
    public void calculateFuelCost(double distanceKm) {
        if (fuelType != FuelType.DIESEL) {
            System.out.println("Trucks require diesel. Calculation not possible for other fuel types.");
            return;
        }

        double fuelNeeded = distanceKm / CONSUMPTION_KM_PER_LITER;
        double cost = fuelNeeded * DIESEL_PRICE_PER_LITER;
        System.out.printf("Truck %s %s fuel cost for %.2f km: $%.2f\n", brand, model, distanceKm, cost);
    }
}