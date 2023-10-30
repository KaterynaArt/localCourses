package lessons.lesson7.switchExample;



public class SwitchWithStringJava7 {
    public static void main(String[] args) {
        String month = switchWithString(2);
        System.out.println(month);
    }
    public static String switchWithString(int month) {
        String monthChoose;
        switch (month) {
            case 1:
                monthChoose = "Январь";
                break;
            case 2:
                monthChoose = "Февраль";
                break;
            case 3:
                monthChoose = "Март";
                break;
            default:
                monthChoose = "Неизвестный месяц";
        }
        return monthChoose;
    }
}
