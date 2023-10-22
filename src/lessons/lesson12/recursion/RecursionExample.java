package lessons.lesson12.recursion;

public class RecursionExample {
    public static void main(String[] args) {
       // System.out.println(simpleFactorial(2));
        System.out.println(recursionFactorial(3));
        //System.out.println(factorial(5) + "!");
    }

    public static int recursionFactorial(int x){
        int result;

        if (x<0){
            return 0;
        }

        if(x<1){
            return 1;
        }
        result = recursionFactorial(x - 1) * x;
        return result;
    }
    public static int simpleFactorial(int x){
        int result = 1;
        for (int i = 1; i <= x; i++){
            result *= i;
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;

        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = n * factorial(n-1);
        return result;
    }



}
