package homeworks.HomeLesson_17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> myStudentArrayList = new ArrayList<>();

        Student firstStudent = new Student("Bob", 100);
        Student secondStudent = new Student("Max", 58);
        Student thirdStudent = new Student("Anna", 70);
        Student fourthsStudent = new Student("Anna", 80);
        Student fifthStudent = new Student("Den", 90);

        myStudentArrayList.add(firstStudent);
        myStudentArrayList.add(secondStudent);
        myStudentArrayList.add(thirdStudent);
        myStudentArrayList.add(fourthsStudent);
        myStudentArrayList.add(fifthStudent);

        ComparatorByAverageGrade myComparatorByAverageGrade = new ComparatorByAverageGrade();
        myStudentArrayList.sort(myComparatorByAverageGrade);

        for (Student i : myStudentArrayList) {
            System.out.println(i);
        }
    }
}
