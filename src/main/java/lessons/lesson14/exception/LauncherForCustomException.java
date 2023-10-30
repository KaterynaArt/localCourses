package lessons.lesson14.exception;

public class LauncherForCustomException {
    public static void main(String[] args) throws CustomException {
//compute(17);

        try {
            compute(17);
        } catch (CustomException e){
            System.out.println(e);
        }
    }

    public static void compute(int number) throws CustomException {
        System.out.println("Compute метод вызван");
        if (number > 10){
            throw new CustomException(number, " Some message about exception");
        }
        System.out.println("Нормальное завершение метода");
    }
}
