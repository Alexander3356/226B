package ch.samt.models;

import java.util.HashSet;

public class EcosystemManager {

    HashSet<AquaticCreature> creatures = new HashSet<>();

    public void addCreature(AquaticCreature creature) {
        creatures.add(creature);
    }

    public void filterByEnergy(int energy) {
        creatures.stream().filter(c -> c.getEnergy() > energy).forEach(System.out::println);
    }

    public void getAdultCreaturesNames(int eta){
        creatures.stream().filter(c -> c.getEnergy() > eta).forEach(System.out::println);
    }

    public void findMostDangerousPredators(int energia, int ferocia){
        creatures.stream()
                .filter(c -> c instanceof Predator)
                .map(creature -> (Predator) creature)
                .filter(c -> c.getEnergy() >= energia && c.getFerocity() >= ferocia)
                .map(AquaticCreature::getName)
                .forEach(System.out::println);
    }

    public void callAllPredatorsPolimorphicMethods(){

    }

    public void callAllPredatorsInheritedMethods(){

    }



}
