package homeworks.Homework20;

import java.util.EnumSet;
public enum BurgerSize {
    SMALL(15.0),
    MEDIUM(17.0),
    LARGE(19.0);

    private double price;

    BurgerSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

