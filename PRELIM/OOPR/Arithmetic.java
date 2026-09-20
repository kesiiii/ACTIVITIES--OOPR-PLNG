package com.mycompany.arithmetic;

import java.util.Scanner; // 1. Import the Scanner class
public class Arithmetic {

    public static void main(String[] args) {
        float x, y;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your X: ");
            x = scanner.nextInt(); // Reads an integer
        
            System.out.print("Enter your Y: ");
            y = scanner.nextInt(); // Reads an integer
           
            System.out.println("Arithmetic Operations: ");
            
        }
        float add, diff, times, div, mod, in, inn, dee, de;
        
        float originalX = x;
        float originalY = y;
            
            add = x + y;
            diff = x - y;
            times = x * y;
            div = x / y;
            mod = x % y;
            in = ++x;
            inn = ++y;
            
            x = originalX;
            y = originalY;
            
            de = x--;
            dee = y--;
            
            System.out.println("Addition: " + x + " + " + y + "= " + add);
            System.out.println("Subtraction: "  + x + " - " + y + "= " + diff);
            System.out.println("Multiplication: "  + x + " * " + y  + "=  " + times);
            System.out.printf("Division: "+ x + " / " + y + "=  %.2f%n" ,  div);
            System.out.println("Modulus: " + x + " % " + y + "= " + mod);
            System.out.println("Increment of X: " + originalX + "++ = " + in);
            System.out.println("Increment of Y: " + originalY + "++ = " + inn);
            System.out.println("Decrement of X: " + originalX + "-- = " + x);
            System.out.println("Decrement of Y: " + originalY + "-- = " + + y);
            
            
    }
}
        
    

