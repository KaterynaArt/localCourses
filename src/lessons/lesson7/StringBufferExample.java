package lessons.lesson7;

import java.util.Arrays;

public class StringBufferExample {
    public static void main(String[] args) {
/*
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer("Alex");

        stringBuffer2.append(new Integer(2));
        stringBuffer2.append("; ");
        stringBuffer2.append(false);
        stringBuffer2.append("; ");
        stringBuffer2.append(Arrays.asList(1,2,3));
        stringBuffer2.append("; ");
*/

      //  System.out.println(stringBuffer2);

        String str = "0123456789";
        StringBuffer stringBuffer3 = new StringBuffer(str);

        System.out.println(stringBuffer3.substring(3));
        System.out.println(stringBuffer3);
        System.out.println(stringBuffer3.substring(4, 8));
        System.out.println(stringBuffer3);
        System.out.println(stringBuffer3.replace(3, 5, "ABCDE"));
        System.out.println(stringBuffer3);

        stringBuffer3 = new StringBuffer(str);
        System.out.println(stringBuffer3.reverse());
        System.out.println(stringBuffer3);
        stringBuffer3.reverse();

        System.out.println(stringBuffer3.delete(5, 9));
 
        System.out.println(stringBuffer3.deleteCharAt(1));

        System.out.println(stringBuffer3.insert(1, "ONE"));

    }
}
