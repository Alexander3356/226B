package ch.samt.models;

public abstract class AquaticCreature implements Creature {

    private int energy;
    private int speed;
    private int eta;
    private String name;

    public AquaticCreature(int energy, int speed, int eta, String name) {
        this.energy = energy;
        this.speed = speed;
        this.eta = eta;
        this.name = name;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void move() {
        energy -= 2;
        if (energy <= 0) {
            System.out.println( name + " è morto");
        } else {
            System.out.println( name + " si muove nell'acqua");
        }
    }

    @Override
    public void eat() {
        energy += 5;
        System.out.println( name + " si è appena nutrito, nuovo livello di energia: " + energy);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
