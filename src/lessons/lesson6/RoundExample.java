package lessons.lesson6;

import lessons.lesson2.Main;

public class RoundExample {
    public static void main(String[] args) {
        mathMethods();
        instanceOfMethod();
        }
        public static void mathMethods(){
            float num = 22.50f; //or double
            System.out.println(Math.round(num));
            System.out.println(Math.ceil(num));
            System.out.println(Math.floor(num));

            int a = (int) Math.floor(num);
            System.out.println(a);


        }

        public static void instanceOfMethod(){
           Float x = new Float(22.50f);

            System.out.println(x instanceof Float);


        }
    }



