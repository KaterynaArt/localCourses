package homeworks.Homework20;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BurgerSize chosenSize = null;
        while (chosenSize == null) {
            System.out.println("Choose a burger size:");
            for (BurgerSize size : BurgerSize.values()) {
                System.out.println(size.name() + " - $" + size.getPrice());
            }

            System.out.print("Enter your choice: ");
            String sizeChoice = scanner.next().toUpperCase();
            try {
                chosenSize = BurgerSize.valueOf(sizeChoice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid burger size choice. Please enter a valid option.");
            }
        }

        System.out.println("Choose a meat type:");
        for (MeatType meat : MeatType.values()) {
            System.out.println(meat.name() + " - $" + meat.getPrice());
        }

        MeatType chosenMeat = null;
        while (chosenMeat == null) {
            System.out.print("Enter your choice: ");
            String meatChoice = scanner.next().toUpperCase();
            try {
                chosenMeat = MeatType.valueOf(meatChoice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid meat type choice. Please enter a valid option.");
            }
        }

        Burger burger = new Burger(chosenSize, chosenMeat);

        System.out.println("Add ingredients or 'Done' to finish:");
        while (true) {
            System.out.println("Available ingredients:");
            for (Ingredient ingredient : Ingredient.values()) {
                System.out.println(ingredient.name() + " - $" + ingredient.getPrice());
            }

            System.out.print("Enter an ingredient or 'Done' to finish: ");
            String input = scanner.next().toUpperCase();

            if (input.equals("DONE")) {
                break;
            }

            Ingredient chosenIngredient = null;
            while (chosenIngredient == null) {
                try {
                    chosenIngredient = Ingredient.valueOf(input);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid ingredient choice. Please enter a valid option.");
                    input = scanner.next().toUpperCase();
                }
            }
            burger.addIngredient(chosenIngredient);
        }

        System.out.println("Here's your burger:");
        burger.displayBurgerInfo();
    }
}