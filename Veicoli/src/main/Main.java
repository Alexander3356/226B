package main;

import main.fourwheels.Camion;
import main.mechanics.Motore;
import main.twowheels.Moto;

public class Main {
    public static void main(String[] args) {

        Camion camion = new Camion("ABC123", "Audi", "Q2", 4, 20000);
        Moto moto = new Moto("DEF456", "Yamaha", "R1", 2, "Sportiva");

        moto.setMotore(new Motore("MTR12345", "YZF"));

        camion.faiRumore();
        moto.faiRumore();
        System.out.println(moto.getMotore());

    }
}