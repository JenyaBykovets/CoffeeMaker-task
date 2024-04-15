package app.view;

import app.model.Cappuccino;
import app.model.Coffee;
import app.model.Espresso;
import app.model.Latte;

import java.util.Scanner;

public class AppCoffeeMaker {
    public void runAppCoffeeMaker(){
        Scanner scanner = new Scanner(System.in);
       Coffee coffee = null;

        System.out.println("Choose a drink: ");
        System.out.println("1 - Espresso");
        System.out.println("2 - Cappuccino");
        System.out.println("3 - Latte");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                coffee = new Espresso();
                break;
            case 2:
                coffee = new Cappuccino();
                break;
            case 3:
                coffee = new Latte();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

            coffee.makeCoffee();

        }
    }



