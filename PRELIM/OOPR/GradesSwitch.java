package com.mycompany.gradesswitch;

import java.util.Scanner; // 1. Import the Scanner class

public class GradesSwitch {
    public static void main(String[] args) {
       
        float java;
        float c;
        float dbh;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your Java Score: ");
            java = scanner.nextInt(); // Reads an integer
            System.out.println("Java Score:"  + java);
            System.out.print("Enter your C Score: ");
            c = scanner.nextInt(); // Reads an integer
            System.out.println("C Score:"  + c);
            System.out.print("Enter your Data Base Handling: ");
            dbh = scanner.nextInt(); // Reads an integer
            System.out.println("Data Base Handling:"  + dbh);
        }
        
        float gradess;
       
        gradess = (java + c + dbh)/3;
        System.out.printf("Average: %.2f%n", gradess);
        
        
        int switchKey = (int) gradess / 5;
        
        
        if (gradess < 0 || gradess > 100) {
            System.out.println("Grade: Invalid Input");
        } else {
            switch (switchKey) {
                // 90 to 100 
                case 20:
                case 19:
                case 18:
                    System.out.println("Grade: A");
                    break;
                
                // 80 to 89 
                case 17:
                case 16:
                    System.out.println("Grade: B");
                    break;
                
                // 75 to 79 
                case 15:
                    System.out.println("Grade: C");
                    break;
                
                // 0 to 74 
                default:
                    System.out.println("Grade: F");
                    break;
            }
        }
    }
}