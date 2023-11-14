package homeworks.HomeworksLesson1_13;
import java.util.Arrays;
import java.util.Scanner;

public class HomeLesson_12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        int[] newArr = someMethod(array, num);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] someMethod(int[] array, int num) {
        int newArrayLength = array.length + 1;
        int[] newArr = new int[newArrayLength];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        newArr[newArrayLength - 1] = num;
        return newArr;
    }
}