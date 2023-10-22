package lessons.lesson5;

public class StringMethods {
    public static void main(String[] args) {
/*    lengthMethod();
    concatMethod();
    trimMethod();
    endsWithMethod();
    caseMethod();
    *///equalsMethod();
   // containsMethod();
    //charAtMethods();
      //toCharArray();
        // indexOfMethods();
           substringMethod();
        //replaceMethod();
    }

    //Заменяет выбранную букву или слово на другую букву/слово. (Сначала что хотим, потом на что хотим)
    public static void replaceMethod() {
        String str = "My name is Alexaaa";
        String replacedStr = str.replace("a", "000");
        System.out.println(replacedStr);
    }

    //возвращает часть строки
    public static void substringMethod() {
        String str = "My name is Alex";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 9));
    }

    //Возвращает индекс, на котором стоит символ или начинается слово
    public static void indexOfMethods() {
        String str = "My name is Alex, ooo o oo ";
        System.out.println(str.indexOf('M'));
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("Alex"));
        System.out.println(str.indexOf("dasdad"));
    }

    //Делает из строки массив чаров
    public static void toCharArray() {
        String str = "My name is Alex";
        char[] result = str.toCharArray();

      /*  for (Character r : result) {
            System.out.print(r);

        }*/
        for (int i = 0; i < result.length; i++) {


            System.out.println(("Element [" + i + "] " + result[i]));
        }
        }


    //Возвращает символ, стоящий на определенном индексе
    public static void charAtMethods() {
        String str = "My name is Alex";
        char result = str.charAt(4);
        System.out.println(result);
    }

    //Выводит тру/фолс если одна строка содержится в другой
    public static void containsMethod() {
        String str = "My name is Alex";
        String str2 = "Alex";
        System.out.println(str.contains(str2));
    }

    //Сравнивает 2 строки и если они равны выводит тру
    public static void equalsMethod() {
        String str = "My name is Alex";
        String str2 = "My name is Alex";
        System.out.println(str.equals(str2));
    }

    //Выводит длину строки
    public static void lengthMethod() {
        String name = "Alex Alex";
        System.out.println(name.length());
    }

    //соединяет строки
    public static void concatMethod() {
        String text = "Hello ";
        String text2 = "world";
        String result = text.concat(text2);
        System.out.println(result);
    }

    //Убирает пробелы в начале и в конце
    public static void trimMethod() {
        String str = "    my name is alex   ";
        String str2 = "    my name is alex   ";
        System.out.println(str.trim());
        System.out.println(str2);
    }

    //Возвращает тру/фолс если наша строка заканчивается на такое же значение из другой переменной
    public static void endsWithMethod() {
        String str = "My name is Alex";
        boolean ends1 = str.endsWith("Alex");
        boolean ends2 = str.endsWith("Maks");

        System.out.println(ends1);
        System.out.println(ends2);
    }

    //Переводит строку в верхний/нижний регистр
    public static void caseMethod() {
        String str = "My name is Alex";
        String toUpper = str.toUpperCase();
        String toLower = str.toLowerCase();

        System.out.println(toUpper);
        System.out.println(toLower);
    }
}
