package lessons.lesson11.logical.operators;

public class OperatorAnd {
    public static void main(String[] args) {
        exampleWithTwoApmpersand();
    }


    public static void exampleWithOneApmpersand() {


        int mouse = 5;
        int weight = 45;
        if (mouse != 0 & weight < 100) {
            System.out.println("Можно кормить кота");
        }
    }

    public static void exampleWithTwoApmpersand() {
        int a = 10;
        if (++a == 10 && ++a == 12) {
            ++a;
        }
        System.out.println(a);
    }

}

