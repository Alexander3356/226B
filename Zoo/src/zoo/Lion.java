package zoo;

public class Lion extends Mammal implements Feedable {

    public Lion(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String makeSound() {
        return "Roooar";
    }

    @Override
    public void eat(String food) {

    }
}
