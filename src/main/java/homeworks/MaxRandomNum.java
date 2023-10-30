package homeworks;

import java.util.Arrays;
import java.util.Random;

public class MaxRandomNum {
    public static void main(String[] args) {

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100) + 1);
        }
//            System.out.println(Arrays.toString(array));

        int maxNumer = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumer) {
                maxNumer = array[i];

            }
        }
        System.out.println(maxNumer);
    }
}




