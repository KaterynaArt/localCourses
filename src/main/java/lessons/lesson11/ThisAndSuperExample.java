package lessons.lesson11;

public class ThisAndSuperExample {

    public static void main(String[] args) {
        int x = 1;
        int y =1;
        int z = 0;
        if(!(x++ > 1 & y++ >1 )){
            z = x + y;
        }
        System.out.println(z);
    }
    int value = 10;

}


class Child extends ThisAndSuperExample{

    int value = 20;

    public void print(){
        int value = 30;
        System.out.println(value);
        System.out.println(this.value);
        System.out.println(super.value);



    }
}