package lessons.lesson8.oop.common;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
        new Person().sayHello();//сокращенная запись если нам надо вызвать один метод
    }
}
