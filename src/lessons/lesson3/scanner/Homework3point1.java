package lessons.lesson3.scanner;

import java.util.Scanner;

public class Homework3point1 {
    public static void main(String[] args) {
        // numberFromConsole();
        threeNumbers();
    }

    public static void numberFromConsole() {
        System.out.println("Введите число 1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }
    }

    public static void threeNumbers() {
        System.out.println("Введите число 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else if (number == 2) {
            System.out.println("Вы ввели число 2");
        } else if (number == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}
