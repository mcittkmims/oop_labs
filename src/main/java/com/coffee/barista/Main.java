package com.coffee.barista;

import java.util.Scanner;

import com.coffee.barista.cafe.*;
import com.coffee.enums.Intensity;
import com.coffee.enums.SyrupType;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This is a machine that takes orders and sends them to a barista
        System.out.println("Please enter your order!");
        System.out.println("Coffee in menu:\n" +
                "1. Cappuccino\n" +
                "2. Americano\n" +
                "3. PumpkinSpiceLatte\n" +
                "4. SyrupCappuccino");

        // Variable to store all the order details separated by ,       
        String orders = "";

        System.out.print("What coffee would you like? ");
        while (true) {
            String coffee = scanner.nextLine();
    
            if (isValidCoffee(coffee.toUpperCase())) {
                orders += coffee.toUpperCase() + ",";

                System.out.print("What intensity do you want? (LIGHT, NORMAL, STRONG): ");
                while (true) {
                    String intensity = scanner.nextLine();

                    if (isValidIntensity(intensity.toUpperCase())) {
                        orders += intensity.toUpperCase() + ",";
                        break;
                    }
                    System.out.print("Try again: ");
                }

                System.out.print("How many ml of milk/water do you want?: ");
                while (true) {
                    String number = scanner.nextLine();

                    if (isValidNumber(number)) {
                        orders += number + ",";
                        break;
                    }
                    System.out.print("Not a valid cantity! ");
                }

                // Additional condition for PumpkinSpiceLatte
                if (coffee.toUpperCase().equals("PUMPKINSPICELATTE")) {
                    System.out.print("How many mg of pumpkin spice do you want?: ");
                    while (true) {
                        String number = scanner.nextLine();
                        if (isValidNumber(number)) {
                            orders += number + ",";
                            break;
                        }
                        System.out.print("Not a valid cantity! ");
                    }
                }
                // Additional condition for SyrupCappuccino
                if (coffee.toUpperCase().equals("SYRUPCAPPUCCINO")) {
                    System.out.println(
                            "What type of syrup do you want? (MACADAMIA, VANILLA, COCONUT, CARAMEL, CHOCOLATE, POPCORN): ");
                    while (true) {
                        String syrup = scanner.nextLine();
                        if (isValidSyrup(syrup.toUpperCase())) {
                            orders += syrup.toUpperCase() + ",";
                            break;
                        }
                        System.out.print("Not a valid syrup! ");
                    }
                }
                
                System.out.println("Would you like another coffee?(yes or no)");
                boolean option;
                while (true) {
                    String choice = scanner.nextLine();
                    if (choice.equals("no")) {
                        option = true;
                        break;
                    } else if (choice.equals("yes")) {
                        option = false;
                        break;
                    }
                    System.out.print("Not a valid choice! ");
                }
                // Exit if customer does not want another coffee
                if (option) {
                    break;
                }
                System.out.print("What other coffee would you like? ");

            } else {
                System.out.print("Not a valid coffee type! ");
            }
        }

        // Printing the orders for checking
        System.out.println();
        System.out.println(orders);

        Barista adrian = new Barista();
        System.out.println();
        System.out.println("The barista is preparing your order!!");
        adrian.makeOrders(orders);

        System.out.println("All finished orders: ");
        adrian.showAllOrdersDetails();
    }

    public static boolean isValidIntensity(String intensity) {
        try {
            Enum.valueOf(Intensity.class, intensity);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static boolean isValidNumber(String number) {
        try {
            Integer.valueOf(number);
        } catch (NumberFormatException e) {
            return false;
        }
        if (Integer.valueOf(number) > 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidCoffee(String coffee) {
        return coffee.equals("CAPPUCCINO")
                || coffee.equals("AMERICANO")
                || coffee.equals("PUMPKINSPICELATTE")
                || coffee.equals("SYRUPCAPPUCCINO");
    }
    
    public static boolean isValidSyrup(String syrup) {
        try {
            Enum.valueOf(SyrupType.class, syrup);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
