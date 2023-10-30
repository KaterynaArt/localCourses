public class  ReplaceEvenNumbers {
    public static void main(String[] args) {
        // Создаем массив с числами
        char[] myArray = {'1', '2', '3', '4', '5', '6', '7', '8'};

        // Заменяем четные числа на символ 'Y'
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= '0' && myArray[i] <= '9') {
                int num = Character.getNumericValue(myArray[i]);
                if (num % 2 == 0) {
                    myArray[i] = 'Y';
                }
            }
        }

        // Выводим результат
        for (char element : myArray) {
            System.out.print(element + " ");
        }
    }
}