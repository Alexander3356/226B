package ch.samt.models;

public class Jellyfish extends AquaticCreature {

    public Jellyfish(int energy, int speed, int eta, String name) {
        super(energy, speed, eta, name);
    }

    @Override
    public void makeSound() {
        System.out.println("suono della medusa");
    }
}
