package lessons.lesson13.abstractExample;

import lessons.lesson13.interfaceExample.IParts;

public class Launcher {

    public static void main(String[] args) {
        Car toyota = new Toyota("Diesel");
        aboutCar(toyota);
        //toyota.getFuel("Diesel");
        Car bmw = new Bmw();
        aboutCar(bmw);
        Car nissan = new Nissan("Petrol");
        aboutCar(nissan);
        IParts.partsPrice(31);
    }

    static void aboutCar(Car car) {
        System.out.println("Максимальная скорость авто " + car.maxSpeed());
        car.drive();
        car.brake();

    }
}
