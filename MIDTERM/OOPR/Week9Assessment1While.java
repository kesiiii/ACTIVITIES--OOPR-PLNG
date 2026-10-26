package com.mycompany.week9assessment1while;
import java.util.Scanner;

public class Week9Assessment1While {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        int i = 0;
        while (i < 5) {
           System.out.println(name);
           i++;
        }
        }
    }
}
