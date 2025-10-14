package main;

import main.fourwheels.Auto;
import main.fourwheels.Camion;
import main.interfaces.Assicurabile;
import main.interfaces.Riparabile;
import main.mechanics.Motore;
import main.service.AgenziaAssicurativa;
import main.service.Officina;
import main.twowheels.Moto;

public class Main {
    public static void main(String[] args) {
        //esercizio 1
        //Camion camion = new Camion("ABC123", "Audi", "Q2", 4, 20000);
        //Moto moto = new Moto("DEF456", "Yamaha", "R1", 2, "Sportiva");

        //moto.setMotore(new Motore("MTR12345", "YZF"));

        //camion.faiRumore();
        //moto.faiRumore();
        //System.out.println(moto.getMotore());

        //esercizio 2
        Camion miocamion = new Camion("ABC123", "Audi", "Q2", 4, 20000);
        Auto miaAuto = new Auto("123456", "Audi", "Q1", 4, 4);
        Auto miaAuto2 = new Auto("789", "Audi", "Q1", 4, 4);
        Moto miaMoto = new Moto("DEF456", "Yamaha", "R1", 2, "Sportiva");
        System.out.println(miaAuto.calcolaCostoRiparazione(3));
        System.out.println(miaMoto.getCostoAssicurazione());

        Riparabile rip;
        Assicurabile ass;
        rip = miaAuto;

        System.out.println(miaMoto.getCostoAssicurazione());

        Officina officina = new Officina();
        AgenziaAssicurativa agenziaAssicurativa = new AgenziaAssicurativa();

        officina.accettaVeicolo(miaAuto);
        officina.accettaVeicolo(miaAuto2);
        officina.accettaVeicolo(miaMoto);

        agenziaAssicurativa.aggiungiVeicolo(miaMoto);
        //agenziaAssicurativa.aggiungiVeicolo(miaAuto); la classe auto non implementa l'interfaccia "Assicurabile"

        officina.stampaSchedarioRiparazioni();
        agenziaAssicurativa.calcolaIncassoTotale();


    }
}