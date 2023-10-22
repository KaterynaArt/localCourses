package lessons.lesson12.finalExample;

 class SomeClass extends MethodFinal{


    @Override
    public void sayAge() {
        super.sayAge();
        System.out.println("rere");
    }

    public void aboutPerson(){
        sayHello();
        sayAge();
    }
}
