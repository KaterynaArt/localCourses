package lessons.lesson9.override;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        cat.voice(22);

        LittleCat marik = new LittleCat();
        marik.voice();
    }
}
