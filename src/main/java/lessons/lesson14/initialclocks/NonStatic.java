package lessons.lesson14.initialclocks;

public class NonStatic {
    String name;

    {
        name = "Alex";
        age = 34;
        isWork = true;
    }

    int age;
    boolean isWork;

    public NonStatic(String name, int age, boolean isWork) {
        this.name = name;
        this.age = age;
        this.isWork = isWork;
    }

    public NonStatic() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}
