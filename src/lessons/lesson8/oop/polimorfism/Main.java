package lessons.lesson8.oop.polimorfism;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(5));
        System.out.println(add(1,5));
        System.out.println(add(10.0, 15.4));
        System.out.println(add("Alex", "35"));
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a){
        return a + 10;
    }
    public static double add(double a, double b){
        return a + b;
    }

    public static String add(String a, String b){
        return a + " " + b;
    }

}
