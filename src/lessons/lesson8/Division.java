package lessons.lesson8;

public class Division {
    public static void main(String[] args) {
divisionExample();
divisionExample2();
    }


    public static void divisionExample(){
        int a = 9;
        int b = 4;
        System.out.println(a%b);
    }
    public static void divisionExample2(){
        int year = 2013;
        int divisionResult = year % 1000    ;
        System.out.println(divisionResult);
    }
}
