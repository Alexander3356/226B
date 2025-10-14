package zoo;

public class Elephant extends Mammal implements Feedable {

    public Elephant(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String makeSound() {
        return "Paaah";
    }

    @Override
    public void eat(String food) {

    }
}
