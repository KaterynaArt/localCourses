package lessons.lesson13.interfaceExample;

public interface IParts {

    int choosePart(int number);

    static double partsPrice(int number){
        return 33.33 * number;
    }
}
