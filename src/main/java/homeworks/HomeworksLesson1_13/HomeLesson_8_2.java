package homeworks.HomeworksLesson1_13;

public class HomeLesson_8_2 {
    public static void main(String[] args) {
        double sum = 0.0;
        double average;

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 11) + 10);
        }
        for (int i : array) {
            sum += i;
        }

        average = sum / array.length;
        System.out.println(average);
    }
}







