package ch.samt.models;

public abstract class Predator extends AquaticCreature {

    private int ferocity;

    public Predator(int energy, int speed, int eta, String name, int ferocity) {
        super(energy, speed, eta, name);
        this.ferocity = ferocity;
    }

    public boolean hunt(){
        if ((ferocity + getSpeed() + (int)(Math.random() * 101)) >= 200 ){
            return true;
        } else  {
            setEnergy(getEnergy() - 2);
            return false;
        }
    }

    public int getFerocity() {
        return ferocity;
    }

    public void setFerocity(int ferocity) {
        this.ferocity = ferocity;
    }
}
