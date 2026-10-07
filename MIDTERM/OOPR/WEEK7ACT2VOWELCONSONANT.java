package com.mycompany.week7act2vowelconsonant;

import java.util.Scanner;

public class WEEK7ACT2VOWELCONSONANT {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String mm;
        do {
        System.out.print("Enter a letter: ");
            char ch = scanner.next().charAt(0);
            char uc = Character.toUpperCase(ch);
        if (uc == 'A' || uc == 'E' || uc == 'I' || uc == 'O' || uc == 'U' ) {
            System.out.println("It's a Vowel!");
        }
        else {
            System.out.println("It's a Consonant!");
        }
        System.out.print("\nDo you want to continue: ");
            scanner.nextLine();
            mm = scanner.nextLine();   
           } while (mm.equalsIgnoreCase("yes"));
        }
            System.out.print("\nPROGRAM TERMINATED");
        }
    }

