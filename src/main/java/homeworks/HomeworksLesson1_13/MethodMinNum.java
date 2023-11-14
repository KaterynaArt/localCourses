package homeworks.HomeworksLesson1_13;

public class MethodMinNum {
    public static void main(String[] args) {
        int minNumberMethod = minNumber(5, 5);
        System.out.println(minNumberMethod);
    }
    public  static int minNumber(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
