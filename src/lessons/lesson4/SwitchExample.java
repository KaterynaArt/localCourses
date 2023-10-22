package lessons.lesson4;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        switchCondition();
    }

    public static void switchCondition(){
        System.out.println("Введите число 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number){
            case 1: System.out.println("Вы ввели число 1");
            break;
            case 2: System.out.println("Вы ввели число 2");
            break;
            case 3: System.out.println("Вы ввели число 3");
            break;
            default: System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
        public static void simpleCondition(){
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
