package homeworks.Homework20;

import java.util.EnumSet;
public enum MeatType {
    BEEF(2.9),
    CHICKEN(1.1),
    FISH(3.6);

    private double price;

    MeatType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}