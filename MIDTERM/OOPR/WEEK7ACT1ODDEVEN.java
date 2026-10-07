package com.mycompany.week7act1oddeven;

import java.util.Scanner;
public class WEEK7ACT1ODDEVEN {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String mm;
        do {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("It's an even number!");
        }
        else {
            System.out.println("It's an odd number!");
        }
        System.out.print("\nDo you want to continue: ");
            scanner.nextLine();
            mm = scanner.nextLine();   
           } while (mm.equalsIgnoreCase("yes"));
        }
            System.out.print("\nPROGRAM TERMINATED");
        }
    }

