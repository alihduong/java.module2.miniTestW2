package person;

public class Students extends Person{
    private double averageScore;

    public Students(double averageScore) {
        this.averageScore = averageScore;
    }

    public Students(int id, String name, int age) {
        super(id, name, age);
    }
}
