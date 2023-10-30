package homeworks;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Введите число 1 ");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }
    }
}
