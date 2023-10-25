/* OOPROG21 ACTIVITY ONE: WHAT DOES THE ANIMAL SAY?
Name: Rubi, Larie Jane */

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("====================  ACTIVITY NUMBER ONE : WHAT DOES THE ANIMAL SAY? ===================");
            System.out.println("Select an animal: ");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Cow");
            System.out.println("4. Fox");
            System.out.println("0: Exit");
            
            System.out.printf("\nEnter selected number: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Animal: Dog");
                    System.out.println("Arf! Arf!");
                    break;
                case 2:
                    System.out.println("Animal: Cat");
                    System.out.println("Meow~ Meow~ ");
                    break;
                case 3:
                    System.out.println("Animal: Cow");
                    System.out.println("Moo Moo");
                    break;
                case 4:
                    System.out.println("Animal: Fox");
                    System.out.println("Ding! Ding!");
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try Again.");
                    break;
            }
        }
    }
}