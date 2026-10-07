package com.mycompany.week8act2;
import java.util.Scanner;

public class WEEK8ACT2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String y;
            do {
                System.out.print("Enter a number from 1-10: ");
                int n = scanner.nextInt();
            
                switch (n) {
                    case 1 -> System.out.print("One");
                    case 2 -> System.out.print("Two");
                    case 3 -> System.out.print("Three");
                    case 4 -> System.out.print("Four");
                    case 5 -> System.out.print("Five");
                    case 6 -> System.out.print("Six");
                    case 7 -> System.out.print("Seven");
                    case 8 -> System.out.print("Eight");
                    case 9 -> System.out.print("Nine");
                    case 10 -> System.out.print("Ten");
                    default -> System.out.print("Invalid Number");   
                }
                System.out.print("\nAgain? y/n: ");
                scanner.nextLine();
                y = scanner.nextLine();
            } while (y.equalsIgnoreCase("y"));
                System.out.print("Exiting...");
        }
    }
}
