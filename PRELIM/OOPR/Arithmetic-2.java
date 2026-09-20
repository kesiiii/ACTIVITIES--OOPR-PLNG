package com.mycompany.arithmetic;
import java.util.Scanner; // 1. Import the Scanner class
public class Arithmetic {
    public static void main(String[] args) {
        
        
        try (Scanner scanner = new Scanner(System.in)) {
            double x, y;
            String mm;
            do {
            System.out.print("Enter your X: ");
            x = scanner.nextDouble(); // Reads an integer
            System.out.print("Enter your Y: ");
            y = scanner.nextDouble(); // Reads an integer
            System.out.println(" ");
            System.out.println("Arithmetic Operations: ");
        
        double add, diff, times, div, mod, in, inn, de, dee;
        double originalX = x;
        double originalY = y;
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
            
            System.out.println(" ");
            System.out.println("Addition: " + x + " + " + y + "= " + add);
            System.out.println("Subtraction: "  + x + " - " + y + "= " + diff);
            System.out.println("Multiplication: "  + x + " * " + y  + "=  " + times);
            System.out.printf("Division: "+ x + " / " + y + "=  %.2f%n" ,  div);
            System.out.println("Modulus: " + x + " % " + y + "= " + mod);
            System.out.println("Increment of X: " + originalX + "++ = " + in);
            System.out.println("Increment of Y: " + originalY + "++ = " + inn);
            System.out.println("Decrement of X: " + originalX + "-- = " + x);
            System.out.println("Decrement of Y: " + originalY + "-- = " + + y);
            
            System.out.print("\nDo you want to continue: ");
            scanner.nextLine();
            mm = scanner.nextLine();   
           } while (mm.equalsIgnoreCase("yes"));
       }
            System.out.print("\nPROGRAM TERMINATED");
         
      }
}
 
           
