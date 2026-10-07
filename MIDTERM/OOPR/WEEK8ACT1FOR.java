
package com.mycompany.week8act1for;
import java.util.Scanner;
public class WEEK8ACT1FOR {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
            for (int i = 0; i < 5; i++) {
               System.out.println(name);
            }
        }
    }
}