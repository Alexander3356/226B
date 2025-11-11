package ch.samt.models;

public class Shark extends Predator {

    public Shark(int energy, int speed, int eta, String name, int ferocity) {
        super(energy, speed, eta, name, ferocity);
    }

    @Override
    public void makeSound() {
        System.out.println("verso dello squalo");
    }


}
