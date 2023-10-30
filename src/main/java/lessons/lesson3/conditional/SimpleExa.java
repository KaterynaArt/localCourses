package lessons.lesson3.conditional;

public class SimpleExa {
    public static void main(String[] args) {
        //simple();
        difficultExample();
    }

    public static void simple(){
        int num = 6;
        int num2 = 6;

        if(num != num2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }

    public static void difficultExample(){
        int num = 6;
        int num2 = 5;

        if(num != num2){
            System.out.println("Числа не равны");
        } else if (num > num2) {
            System.out.println("Первое число больше второго");
        } else if (num < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}
