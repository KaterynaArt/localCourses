package lessons.lesson4.loops;

public class ForEachLoop {
    public static void main(String[] args) {
     example();
    }

    public static void forEachExampleString(){
        String[] names = {"Alex", "Igor", "Maks"};
        for (String name : names){
            System.out.println("Name of employee - " + name);
        }
    }
    public static void forEachExample(){
        int [] arr = {5, 7, 8, 10};
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void example(){
        int sum;
        for (int i = 1; i <= 10; i++) {
            sum = 3 * i;
            System.out.println(3 + " * " + i + " = " + sum);

        }
    }

    public static void example1(){
        int [] number = {5, 4, 3, 2, 1};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }
    }
}
