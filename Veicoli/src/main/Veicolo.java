package main;

import main.mechanics.Motore;

import java.util.Objects;

public class Veicolo {

    private String targa;
    private String marca;
    private final String modello;
    private int numero_posti;
    private Motore motore;

    public Veicolo(String targa, String marca, String modello, int numero_posti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numero_posti = numero_posti;
    }

    public void faiRumore() {
        System.out.println("Wruuuum");
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }


    public int getNumero_posti() {
        return numero_posti;
    }

    public void setNumero_posti(int numero_posti) {
        this.numero_posti = numero_posti;
    }

    public Motore getMotore() {
        return motore;
    }

    public void setMotore(Motore motore) {
        this.motore = motore;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", numero_posti=" + numero_posti +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veicolo veicolo = (Veicolo) o;
        return marca.equalsIgnoreCase(veicolo.marca) && modello.equalsIgnoreCase(veicolo.modello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targa, marca, modello, numero_posti);
    }
}
