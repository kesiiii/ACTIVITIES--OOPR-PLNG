package com.mycompany.week9assessment1dowhile;
import java.util.Scanner;

public class Week9Assessment1DoWhile {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            int i = 0;
            do {
                System.out.println(name);
                i++;
            } while (i < 5);
        }
    }
}
