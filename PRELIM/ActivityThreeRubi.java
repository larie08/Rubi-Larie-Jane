/*OOPROG 21: ACTIVITY NUMBER 3
Name: Rubi, Larie Jane BSIT 2B */

import java.util.Scanner;

public class ActivityThreeRubi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoToDollarConversionRate = 0.0176;

        String[] menuItems = {"C1 - Burger", "C2 - Chicken", "C3 - Pepper Steak"};
        double[] menuItemPricesInPeso = {100.00, 150.00, 200.00};

        String[] addOns = {"R1 - Fries", "R2 - Soda", "R3 - Gravy"};
        double[] addOnPricesInPeso = {50.00, 75.00, 25.00};

        System.out.println("======== WELCOME TO MCDONALDO ============");

        System.out.println("Menu Items:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i] + " - PHP " + menuItemPricesInPeso[i]);
        }

        System.out.println("\nAdd-ons:");
        for (int i = 0; i < addOns.length; i++) {
            System.out.println(addOns[i] + " - PHP " + addOnPricesInPeso[i]);
        }
        double totalOrderPriceInPeso = 0.00;
        int totalQuantity = 0;
        String orderDetails = "";
        
        while (true) {
            System.out.print("\nPlace your order (enter X to Exit):  ");
            String choice = scanner.next();

            if (choice.equals("X")) {
                break;
            }

            boolean validChoice = false;

            for (int i = 0; i < menuItems.length; i++) {
                if (choice.equals("C" + (i + 1))) {
                    System.out.print("How many would you like to order?: ");
                    int quantity = scanner.nextInt();
                    
                    double itemPriceInPeso = menuItemPricesInPeso[i] * quantity;
                    totalOrderPriceInPeso += itemPriceInPeso;
                    totalQuantity += quantity;
                    orderDetails += menuItems[i] + " x" + quantity + " - PHP" + itemPriceInPeso + "\n";
                    validChoice = true;
                    break;
                }
            }

            if (!validChoice) {
                System.out.println("Invalid item code. Please choose a valid item code (e.g., C1).");
            }
        }
        
        while (true) {
            System.out.print("\nPlace your add-ons: ");
            String choice = scanner.next();

            if (choice.equals("X")) {
                break;
            }

            boolean validChoice = false;

            for (int i = 0; i < addOns.length; i++) {
                if (choice.equals("R" + (i + 1))) {
                    System.out.print("How many would you like to add?: ");
                    int quantity = scanner.nextInt();
                    
                    double addOnPriceInPeso = addOnPricesInPeso[i] * quantity;
                    totalOrderPriceInPeso += addOnPriceInPeso;
                    totalQuantity += quantity;
                    orderDetails += addOns[i] + " x" + quantity + " - PHP" + addOnPriceInPeso + "\n";
                    validChoice = true;
                    break;
                }
            }

            if (!validChoice) {
                System.out.println("Invalid add-on code. Please choose a valid add-on code (e.g., R1).");
            }
        }
        
        System.out.println("\nOrder Details:\n" + orderDetails);
        System.out.println("Total Quantity: " + totalQuantity);
        System.out.println("Total Price in Peso: PHP" + totalOrderPriceInPeso);

        double totalOrderPriceInDollar = totalOrderPriceInPeso * pesoToDollarConversionRate;
        System.out.println("Total Price in Dollar: $" + totalOrderPriceInDollar);

        scanner.close();
    }
}