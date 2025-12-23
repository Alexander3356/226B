import java.util.Objects;

public class GradeRegister {

    int sumOfGrades;
    int numberOfGrades;
    int numberOfStudentsNamedAnna;
    int numberOfStudentsNamedRossi;

    public GradeRegister(int sumOfGrades, int numberOfGrades, int numberOfStudentsNamedAnna, int numberOfStudentsNamedRossi) {
        this.sumOfGrades = sumOfGrades;
        this.numberOfGrades = numberOfGrades;
        this.numberOfStudentsNamedAnna = numberOfStudentsNamedAnna;
        this.numberOfStudentsNamedRossi = numberOfStudentsNamedRossi;
    }

    public void addNewGrade(int grade) {
        sumOfGrades += grade;
        numberOfGrades++;
    }

    public void averageGrade(){
        sumOfGrades = sumOfGrades / numberOfGrades;
    }

    public int getSumOfGrades() {
        return sumOfGrades;
    }

    public void setSumOfGrades(int sumOfGrades) {
        this.sumOfGrades = sumOfGrades;
    }

    public int getNumberOfGrades() {
        return numberOfGrades;
    }

    public void setNumberOfGrades(int numberOfGrades) {
        this.numberOfGrades = numberOfGrades;
    }

    public int getNumberOfStudentsNamedAnna() {
        return numberOfStudentsNamedAnna;
    }

    public void setNumberOfStudentsNamedAnna(int numberOfStudentsNamedAnna) {
        this.numberOfStudentsNamedAnna = numberOfStudentsNamedAnna;
    }

    public int getNumberOfStudentsNamedRossi() {
        return numberOfStudentsNamedRossi;
    }

    public void setNumberOfStudentsNamedRossi(int numberOfStudentsNamedRossi) {
        this.numberOfStudentsNamedRossi = numberOfStudentsNamedRossi;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GradeRegister that = (GradeRegister) o;
        return sumOfGrades == that.sumOfGrades && numberOfGrades == that.numberOfGrades && numberOfStudentsNamedAnna == that.numberOfStudentsNamedAnna && numberOfStudentsNamedRossi == that.numberOfStudentsNamedRossi;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sumOfGrades, numberOfGrades, numberOfStudentsNamedAnna, numberOfStudentsNamedRossi);
    }
}
