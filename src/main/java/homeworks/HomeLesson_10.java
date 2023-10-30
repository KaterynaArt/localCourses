package homeworks;

import java.util.Scanner;

public class HomeLesson_10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int fromConsole = getInt();
        int fromConsole2 = getInt();
        char operation = getOperation();
        int result = calc(fromConsole, fromConsole2, operation);
        System.out.println(result);
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Ошибка. Введите повторно число:");
            scanner.next();
            number = getInt();
        }
        return number;
    }

    public static char getOperation() {
        System.out.println("Введrrrите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка: введите операцию.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int fromConsole, int fromConsole2, char operation){
        int result;
        switch (operation){
            case '+':
                result = fromConsole + fromConsole2;
                break;
            case '-':
                result = fromConsole-fromConsole2;
                break;
            case '*':
                result = fromConsole *fromConsole2;
                break;
            case '/':
                if (fromConsole2 != 0) {
                    result = fromConsole / fromConsole2;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    result = calc(fromConsole, fromConsole2, getOperation());
                }
                result = fromConsole/fromConsole2;
                break;
            default:
                System.out.println("Введите операцию:");
                result = calc(fromConsole, fromConsole2, getOperation());
        }
        return result;
    }

}
