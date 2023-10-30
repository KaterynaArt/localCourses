package lessons.lesson7;

public class StringPool {
    public static void main(String[] args) {
        String name = "Alex"; // стринг через литерал
        String name2 = "Alex"; // создастся 1 объект ,а name / name 2  будут ссылаться на один объект
        System.out.println(name == name2);

        String name3 = new String("Alex");
        String name4 = new String("Alex"); // будут разные объекты и если сравнить будет фолс
        System.out.println(name2 == name4);
        System.out.println(name3 == name4);

        String name5 = new String("Alex").intern();
        String name6 = new String("Alex").intern(); // приводит в StringPool

        System.out.println(name5 == name6);


        String str = "Hello, world".toUpperCase().concat("Alex");//создаются новые объекты String. Будет 3 объекта.



    }


}
