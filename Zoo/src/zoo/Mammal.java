package zoo;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return hasFur == mammal.hasFur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasFur);
    }

    @Override
    public String toString() {
        return super.toString() +
                "hasFur=" + hasFur +
                '}';
    }
}
