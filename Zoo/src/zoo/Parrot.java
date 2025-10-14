package zoo;

public class Parrot extends Animal implements Feedable{

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "cra cra";
    }

    @Override
    public void eat(String food) {

    }
}
