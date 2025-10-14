package main.service;

import main.interfaces.Assicurabile;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AgenziaAssicurativa {

    Set<Assicurabile> veicoliAssicurati = new HashSet<>();

    public AgenziaAssicurativa() {}

    public void aggiungiVeicolo(Assicurabile veicolo){
        veicoliAssicurati.add(veicolo);
        System.out.println("Veicolo assicurato");
    }

    public double calcolaIncassoTotale(){
        return 200;
    }

    public Set<Assicurabile> getVeicoliAssicurati() {
        return veicoliAssicurati;
    }

    public void setVeicoliAssicurati(Set<Assicurabile> veicoliAssicurati) {
        this.veicoliAssicurati = veicoliAssicurati;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AgenziaAssicurativa that = (AgenziaAssicurativa) o;
        return Objects.equals(veicoliAssicurati, that.veicoliAssicurati);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(veicoliAssicurati);
    }

    @Override
    public String toString() {
        return "AgenziaAssicurativa{" +
                "veicoliAssicurati=" + veicoliAssicurati +
                '}';
    }
}
