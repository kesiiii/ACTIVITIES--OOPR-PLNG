package com.mycompany.week5ass2;

import java.util.Scanner;

public class Week5ass2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter First Number: ");
            double x = scanner.nextDouble(); // Reads an integer
            System.out.print("Enter Second Number: ");
            double y = scanner.nextDouble(); // Reads an integer
            System.out.print("Enter Third Number: ");
            double z = scanner.nextDouble(); // Reads an integer
            
            if (x > y && x > z) {
                System.out.print("The highest number is " + x);
            }
            else if (y > x && y > z) {
                System.out.print("The highest number is " + y);
            }
            else if (z > y && z > x) {
                System.out.print("The highest number is " + z);
            }
            else {
                System.out.print("All are Equal");
            }
        }
    }
}
