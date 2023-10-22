package lessons.lesson4.loops;

import java.io.File;

public class ForLoop {
    public static void main(String[] args) {
        forLoopExample5();
        //usingForWithArray();
        String s = File.separator;
    }

    public static void usingForWithArray(){
        int [] arr = {5, 7, 8, 10};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void forLoopExample() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Привет мир");
        }
    }

    public static void forReverseExample() {
        for (int i = -3; i <= 3; i++) {
            System.out.print(i + " ");
        }

    }

    public static void forLoopExample5() {
        int sum = 0;
        int bum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        for (int i = 1; i <= 5; ++i) {
            bum += i;
        }

        if (sum == bum){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

