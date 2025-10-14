package ch.samt;

public class Main {
    public static void main(String[] args) {
        // Create instances of different vehicle types
        Vehicle sedan = new Car("Honda", "Civic", FuelType.GASOLINE);
        Vehicle cargoTruck = new Truck("Volvo", "FH16", FuelType.DIESEL);
        Vehicle electricCar = new Car("Tesla", "Model S", FuelType.ELECTRIC);

        // Put them in a Vehicle array to demonstrate polymorphism
        Vehicle[] fleet = {sedan, cargoTruck, electricCar};

        double tripDistance = 500.0;

        System.out.println("--- Processing the Vehicle Fleet ---\n");
        for (Vehicle v : fleet) {
            // Polymorphic call
            v.assignDestination("City Center");
            v.calculateFuelCost(tripDistance);
            v.completeTrip(tripDistance);
            System.out.println();
        }
    }
}