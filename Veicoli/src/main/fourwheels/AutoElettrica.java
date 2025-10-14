package main.fourwheels;

import main.interfaces.VeicoloElettrico;

import java.util.Objects;

public class AutoElettrica extends Auto implements VeicoloElettrico {

    private double autonomiaBatteria;

    public AutoElettrica(String targa, String marca, String modello, int numero_posti, int numero_di_porte, double autonomiaBatteria) {
        super(targa, marca, modello, numero_posti, numero_di_porte);
        this.autonomiaBatteria = autonomiaBatteria;
        if (autonomiaBatteria > 100) {
            this.autonomiaBatteria = 100;
        }
        if (autonomiaBatteria < 0) {
            this.autonomiaBatteria = 0;
        }
    }

    @Override
    public void ricarica() {
        try {
            wait(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        autonomiaBatteria = 100;
    }

    @Override
    public double getAutonomiaBatteria() {
        return autonomiaBatteria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AutoElettrica that = (AutoElettrica) o;
        return autonomiaBatteria == that.autonomiaBatteria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), autonomiaBatteria);
    }

    @Override
    public String toString() {
        return "AutoElettrica{" +
                "autonomiaBatteria=" + autonomiaBatteria +
                '}';
    }
}
