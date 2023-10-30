package homeworks.HomeLesson17;

public class Student {
    private String name;
    private int averageGrade;

    public Student(String name, int averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
