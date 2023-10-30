package lessons.lesson3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner2.nextLine();

        int result = number + number2;

        System.out.println(name + " " + result);
    }
}
