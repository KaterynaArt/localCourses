package lessons.lesson7.switchExample;



public class SwitchWithStringJava13 {
    public static void main(String[] args) {
        String month = switchWithString(4);
        System.out.println(month);
    }
    public static String switchWithString(int month) {
        return switch (month) {
            case 1:
                   yield  "Январь";
            case 2:
                yield "Февраль";
            case 3,4:
                yield  "Март";
            default:
                yield "Неизвестный месяц";
        };
    }
}
