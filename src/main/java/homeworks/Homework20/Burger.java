package homeworks.Homework20;

import java.util.ArrayList;
public class Burger {
    private BurgerSize size;
    private MeatType meat;
    private ArrayList<Ingredient> ingredients;

    public Burger(BurgerSize size, MeatType meat) {
        this.size = size;
        this.meat = meat;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public double calculateTotalPrice() {
        double totalPrice = size.getPrice() + meat.getPrice();
        for (Ingredient ingredient : ingredients) {
            totalPrice += ingredient.getPrice();
        }
        return totalPrice;
    }

    public void displayBurgerInfo() {
        System.out.println("Burger size: " + size);
        System.out.println("Meat type: " + meat);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Total price: $" + calculateTotalPrice());

    }
}