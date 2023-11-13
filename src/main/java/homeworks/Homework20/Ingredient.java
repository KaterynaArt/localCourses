package homeworks.Homework20;
import java.util.EnumSet;
public enum Ingredient {
    CHEESE(1.00),
    TOMATO(1.20),
    LETTUCE(1.60);

    private double price;

    Ingredient(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

