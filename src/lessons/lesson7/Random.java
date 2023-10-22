package lessons.lesson7;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Random {
    public static void main(String[] args) {
  //      randomCustom3();
 //       Scanner scanner = new Scanner(System.in);


 //       String str = new Scanner(System.in).nextLine();// если надо 1 раз использовать

        IntStream a = new java.util.Random().ints(0, 5);
        System.out.println(a.toString());
    }

    public static void randomCustom3(){
        //(Math.random() * (b - a)) + a;
        //[0;3) - (Math.random() * (3 - 0)) + 0;
        //int [0, 2]

        int a = (int) (Math.random() * 3);
        System.out.println(a);
    }
    public static void randomCustom(){
        //(Math.random() * (b - a)) + a;
        //[0;3) - (Math.random() * (3 - 0)) + 0;

        double a = Math.random() * 3;
    }

    public static void randomCustom2(){
        //(Math.random() * (b - a)) + a;
        //[2;3) - (Math.random() * (3 - 2)) + 2;

        double a = Math.random() + 2;
    }
    public static void randomDefault() {
        double a = Math.random();
        System.out.println(a);
    }
}
