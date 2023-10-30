package lessons.lesson9.incapsulation.launch;

import lessons.lesson9.incapsulation.cars.*;

public class Main {
    public static void main(String[] args) {
/*        Bmw bmw = new Bmw();
        bmw.aboutCar();
        System.out.println(bmw.fuel);

        Honda honda = new Honda();
        Tesla tesla = new Tesla();*/

/*        Skoda skoda = new Skoda();
        skoda.showAllInfo();
        String model = skoda.getModel();
        System.out.println(model);*/

        Opel opel = new Opel();
        opel.setFuel("Diesel");
        opel.setModel("Omega");
        System.out.println(opel.getFuel() + " it is diesel");

        opel.showAllInfo();

        Opel opel1 = new Opel();
        opel1.showAllInfo();
    }
}
