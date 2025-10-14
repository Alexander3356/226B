package ch.samt;

public class Car extends MotorVehicle {
    private static final double GASOLINE_PRICE_PER_LITER = 1.80;
    private static final double DIESEL_PRICE_PER_LITER = 1.70;
    private static final double CONSUMPTION_KM_PER_LITER = 10.0;

    public Car(String brand, String model, FuelType fuelType) {
        super(brand, model, fuelType);
    }

    @Override
    public void calculateFuelCost(double distanceKm) {
        if (fuelType == FuelType.ELECTRIC) {
            System.out.println("Car " + brand + " " + model + " is electric. No fuel cost.");
            return;
        }

        double fuelNeeded = distanceKm / CONSUMPTION_KM_PER_LITER;
        double price = (fuelType == FuelType.GASOLINE) ? GASOLINE_PRICE_PER_LITER : DIESEL_PRICE_PER_LITER;
        double cost = fuelNeeded * price;
        System.out.printf("Car %s %s fuel cost for %.2f km: $%.2f\n", brand, model, distanceKm, cost);
    }
}
