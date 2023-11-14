package homeworks.HomeworksLesson1_13;

public class HomeLesson_9_2 {
    public static void main(String[] args) {
        String array = "123456789";
        char[] arrayChar = array.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] >= '0' && arrayChar[i] <= '9') {
                int number = Character.getNumericValue(arrayChar[i]);
                if (number % 2 == 0) {
                    arrayChar[i] = 'Y';
                }
            }
        }
            for (char i : arrayChar) {
                System.out.print(i + " ");
            }
        }
    }

