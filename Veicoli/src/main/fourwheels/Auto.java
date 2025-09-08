package main.fourwheels;

import main.Veicolo;

import java.util.Objects;

public class Auto extends Veicolo {

    private int numero_di_porte;

    public Auto(String targa, String marca, String modello, int numero_posti, int numero_di_porte) {
        super(targa, marca, modello, numero_posti);
        this.numero_di_porte = numero_di_porte;
    }

    public int getNumero_di_porte() {
        return numero_di_porte;
    }

    public void setNumero_di_porte(int numero_di_porte) {
        this.numero_di_porte = numero_di_porte;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numero_di_porte=" + numero_di_porte +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return numero_di_porte == auto.numero_di_porte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numero_di_porte);
    }
}
