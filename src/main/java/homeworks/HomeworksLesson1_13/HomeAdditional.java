package homeworks.HomeworksLesson1_13;

import java.util.Scanner;

public class HomeAdditional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Кто там?");

        String userInput = scanner.nextLine().toLowerCase();

        switch (userInput) {
            case "отмена":
                System.out.println("Отмена");
                break;
            case "админ":
                System.out.println("Пароль?");
                String passwordInput = scanner.nextLine().toLowerCase();

                if (passwordInput.equals("я главный")) {
                    System.out.println("Здравствуйте");
                } else if (passwordInput.equals("отмена")) {
                    System.out.println("Отмена");
                } else {
                    System.out.println("Неверный пароль");
                }

                break;

            default:
                System.out.println("Я вас не знаю");
                break;
        }
    }
}