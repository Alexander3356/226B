public class Student {
    private String name;
    private String surname;
    private int grade;

    public Student(String name, String surname, int grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    public void addNewGrade(GradeRegister register){
        register.addNewGrade(grade);
        if (name.equals("Anna")) {
            register.setNumberOfStudentsNamedAnna(
                    register.getNumberOfStudentsNamedAnna()  + 1);
        }
        if (surname.equals("Rossi")) {
            register.setNumberOfStudentsNamedRossi(
                    register.getNumberOfStudentsNamedRossi()  + 1);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
