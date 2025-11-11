package ch.samt.models;

import java.util.HashSet;

public class EcosystemManager {

    private HashSet<AquaticCreature> creatures = new HashSet<>();


    public void addCreature(AquaticCreature creature) {
        creatures.add(creature);
    }

    public void filterByEnergy(int energy) {
        System.out.println("\n*** Creature con energia > " + energy);
        creatures.stream()
                .filter(c -> c.getEnergy() > energy)
                .forEach(c -> System.out.println("- " + c.getName() + " (" + c.getEnergy() + ")"));
    }

    public void getAdultCreaturesNames(int eta){
        System.out.println("\n*** Creature con eta >= " + eta);
        creatures.stream()
                .filter(c -> c.getEta() > eta)
                .forEach(c -> System.out.println("- " + c.getName()));
    }

   public void findMostDangerousPredators(int energia, int ferocia){
       System.out.println("\n*** Predatori più pericolosi:");
        creatures.stream()
                .filter(c -> c instanceof Predator)
                .map(creature -> (Predator) creature)
                .filter(c -> c.getEnergy() >= energia && c.getFerocity() >= ferocia)
                .forEach(c -> System.out.println("- " + c.getName()));
    }

    public void callAllPredatorsPolimorphicMethods(Predator predator){
        System.out.println("\n*** Invoca tutti i metodi polimorfici di un predatore:");
        predator.makeSound();
        if(predator instanceof Dolphin){
            if(predator.hunt() == true){
                System.out.println("preda catturata");
            } else {
                System.out.println("preda fuggita");
            }
        }
    }

    public void callAllPredatorsInheritedMethods(Predator predator){
        System.out.println("\n*** Invoca tutti i metodi ereditati di un predatore:");
        predator.move();
        predator.eat();
        if(!(predator instanceof Dolphin)){
            predator.hunt();
        }
    }

    public HashSet<AquaticCreature> getCreatures() {
        return creatures;
    }

    public void setCreatures(HashSet<AquaticCreature> creatures) {
        this.creatures = creatures;
    }
}
