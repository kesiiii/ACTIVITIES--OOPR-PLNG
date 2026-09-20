package com.mycompany.grades;

import java.util.Scanner; // 1. Import the Scanner class

public class Grades {
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
            }   float gradess;
            gradess = (java + c + dbh)/3;
            System.out.printf("Average: %.2f%n", gradess);
            if (gradess <= 74 ){
                System.out.println("Grade: F");
            }
            else if (gradess <= 79 ){
                System.out.println("Grade: C");
            }
            else if (gradess <= 89 ){
                System.out.println("Grade: B");
            }
            else if (gradess <= 100 ){
                System.out.println("Grade: A");
            }
            else {
                System.out.println("Invalid Input");
            }   System.out.print("\nDo you want to continue? (YES/NO): ");
            
    
            }
   }
   
