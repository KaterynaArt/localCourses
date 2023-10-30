package lessons.lesson13.interfaceExample;

import lessons.lesson13.interfaceExample.ICar;

import static lessons.lesson13.interfaceExample.ICar.OTHER_TYPE_FUEL;

public class Launcher {
    public static void main(String[] args) {
        ICar bmw = new Bmw();
        aboutCar(bmw);
        bmw.getFuel(OTHER_TYPE_FUEL);
        IParts.partsPrice(23);
        bmw.otherMethod();

    }

    static void aboutCar(ICar car) {
        System.out.println("Максимальная скорость авто " + car.maxSpeed());
        car.drive();
        car.brake();

    }
}
