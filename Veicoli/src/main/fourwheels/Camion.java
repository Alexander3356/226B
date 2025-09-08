package main.fourwheels;

import main.Veicolo;

import java.util.Objects;

public class Camion extends Veicolo {

    private int carico;

    public Camion(String targa, String marca, String modello, int numero_posti, int carico) {
        super(targa, marca, modello, numero_posti);
        this.carico = carico;
    }

    public int getCarico() {
        return carico;
    }

    public void setCarico(int carico) {
        this.carico = carico;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "carico=" + carico +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camion camion = (Camion) o;
        return carico == camion.carico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carico);
    }
}
