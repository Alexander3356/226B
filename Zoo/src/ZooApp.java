import zoo.*;

import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("leone", 8, true));
        animals.add(new Elephant("elefante", 17, false));
        animals.add(new Parrot("pappagallo", 3));

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println(animal.makeSound());
            if (animal instanceof Feedable) {
                ((Feedable) animal).eat("Banana");
            }
        }

    }
}