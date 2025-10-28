package ch.samt.models;

public abstract class Predator extends AquaticCreature {

    private int ferocity;

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
