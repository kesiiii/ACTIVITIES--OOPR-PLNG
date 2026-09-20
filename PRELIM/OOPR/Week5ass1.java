package com.mycompany.week5ass1;

import java.util.Scanner;

public class Week5ass1 {

    public static void main(String[] args) {
        
        
        try (Scanner scanner = new Scanner(System.in)) {
        
        System.out.println("Enter First Word: ");
        String x = scanner.nextLine();
        System.out.println("Enter Second Word: ");
        String y = scanner.nextLine();
        System.out.println("Enter Third Word: ");
        String z = scanner.nextLine();
        System.out.println("");
        System.out.println("Phrase: " + x + " " + y + " " + z);
        }
    }
}
