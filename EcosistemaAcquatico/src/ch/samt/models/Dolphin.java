package ch.samt.models;

public class Dolphin extends Predator {

    private int intelligence;

    public Dolphin(int energy, int speed, int eta, String name, int ferocity, int intelligence) {
        super(energy, speed, eta, name, ferocity);
        this.intelligence = intelligence;
    }

    @Override
    public void makeSound() {
        System.out.println("Eee-eee-eee ");
    }

    @Override
    public boolean hunt() {
        if ((intelligence + getFerocity() + getSpeed() + (int)(Math.random() * 101)) >= 200 ){
            return true;
        } else  {
            setEnergy(getEnergy() - 2);
            return false;
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
