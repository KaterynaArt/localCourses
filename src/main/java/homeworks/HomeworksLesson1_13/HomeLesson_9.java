package homeworks.HomeworksLesson1_13;

public class HomeLesson_9 {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10) + 1);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
            else {
                System.out.print('Y'+ " ");
            }
        }
    }
}


