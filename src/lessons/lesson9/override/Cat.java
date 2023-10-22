package lessons.lesson9.override;

public class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("May may");
    }

    public void voice(int c){
        System.out.println("May may" + c);

    }
}
