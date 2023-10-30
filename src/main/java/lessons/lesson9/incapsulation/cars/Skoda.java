package lessons.lesson9.incapsulation.cars;

import lessons.lesson9.incapsulation.owners.SkodaOwner;

public class Skoda extends SkodaOwner {
    private String fuel = "diesel";

    private String model = "octavia";

    public String getModel(){
        return this.model;
    }

    private void aboutCar() {
        System.out.println("It is Skoda");
        showModel();
    }

    private void showModel(){
        System.out.println("Our model " + this.model);
    }

    public void showAllInfo() {
        System.out.println("Fuel of Skoda  " + fuel);
        aboutCar();
    }
}
