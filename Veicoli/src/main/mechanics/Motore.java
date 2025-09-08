package main.mechanics;

import java.util.Objects;

public class Motore {

    private String numeroSerie;
    private String modello;

    public Motore(String numeroSerie, String modello) {
        this.numeroSerie = numeroSerie;
        this.modello = modello;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Motore{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Motore motore = (Motore) o;
        return Objects.equals(numeroSerie, motore.numeroSerie) && Objects.equals(modello, motore.modello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroSerie, modello);
    }
}
