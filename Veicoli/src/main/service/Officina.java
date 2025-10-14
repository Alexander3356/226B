package main.service;

import main.interfaces.Riparabile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Officina {

    private List<Riparabile> veicoliInRiparazione = new ArrayList<>();

    public Officina() {}

    public void accettaVeicolo(Riparabile veicolo) {
        veicoliInRiparazione.add(veicolo);
        System.out.println("Veicolo accettato in officina");
    }

    public void stampaSchedarioRiparazioni() {
        System.out.println("=== VEICOLI IN RIPARAZIONE ===");
        for (Riparabile rip : veicoliInRiparazione) {
            System.out.println("Veicolo: " + rip.toString());
            System.out.println("Costo riparazione stimato (2 ore): €" + rip.calcolaCostoRiparazione(2));
            System.out.println("----------------------------------");
        }
    }

    public List<Riparabile> getVeicoliInRiparazione() {
        return veicoliInRiparazione;
    }

    public void setVeicoliInRiparazione(List<Riparabile> veicoliInRiparazione) {
        this.veicoliInRiparazione = veicoliInRiparazione;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Officina officina = (Officina) o;
        return Objects.equals(veicoliInRiparazione, officina.veicoliInRiparazione);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(veicoliInRiparazione);
    }

    @Override
    public String toString() {
        return "Officina{" +
                "veicoliInRiparazione=" + veicoliInRiparazione +
                '}';
    }
}
