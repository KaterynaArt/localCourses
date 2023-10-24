package homeworks.HomeLesson_17;

import java.util.Comparator;

public class ComparatorByAverageGrade implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAverageGrade(), o1.getAverageGrade());
    }
}
