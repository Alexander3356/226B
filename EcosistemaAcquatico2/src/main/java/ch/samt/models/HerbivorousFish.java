package ch.samt.models;

public class HerbivorousFish extends AquaticCreature {

    public HerbivorousFish(int energy, int speed, int eta, String name) {
        super(energy, speed, eta, name);
    }

    @Override
    public void makeSound() {
        System.out.println("suono del pesce erbivoro");
    }

}
