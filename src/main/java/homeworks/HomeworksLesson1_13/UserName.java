package homeworks.HomeworksLesson1_13;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа ");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number + number2;
        System.out.println("Введите имя ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        System.out.println(name + " " + result);
    }
}
