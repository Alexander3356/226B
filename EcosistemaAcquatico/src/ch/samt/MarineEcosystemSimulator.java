package ch.samt;

import ch.samt.models.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MarineEcosystemSimulator {
    public static void main(String[] args) {

        EcosystemManager manager = new EcosystemManager();

        HerbivorousFish nemo = new HerbivorousFish(50, 30, 2, "Nemo");
        Jellyfish medusa = new Jellyfish(10, 20, 7, "Medusa");
        Shark jaws = new Shark(80, 70, 5, "Jaws", 50);
        Dolphin flipper = new Dolphin(40, 30, 4, "Flipper", 40, 80);

        manager.addCreature(nemo);
        manager.addCreature(medusa);
        manager.addCreature(jaws);
        manager.addCreature(flipper);

        System.out.println("=== SIMULATORE ECOSISTEMA MARINO ===");

        manager.filterByEnergy(50);
        manager.getAdultCreaturesNames(3);
        manager.findMostDangerousPredators(50,45);
        manager.callAllPredatorsPolimorphicMethods(flipper);
        manager.callAllPredatorsInheritedMethods(flipper);
        System.out.println("\n*** Fai muovere una creatura finché non muore:");
        medusa.move();medusa.move();medusa.move();medusa.move();medusa.move();
        System.out.println();
        System.out.println("\n*** Comportamenti specifici:");
        for(AquaticCreature creature : manager.getCreatures()){
            if(creature instanceof Dolphin){
                System.out.println(creature.getName() + " gioca e fa acrobazie");
            }
            if(creature instanceof Jellyfish){
                System.out.println(creature.getName() + " emette una luce bioluminescente");
            }
        }
        System.out.println("\n*** Fai cacciare uno squalo finche non riesce a mangiare:");
        Boolean risultato = false;
        do{
            risultato = jaws.hunt();
            if(risultato == false){
                System.out.println("Caccia fallita, la preda è fuggita, nuovo livello di energia: " + jaws.getEnergy());
            } else {
                System.out.println("Preda catturata");
                jaws.eat();
            }
        } while (risultato == false);


    }
}