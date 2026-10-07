package com.mycompany.allprogram; // Defines the package namespace for this class

import java.io.*; // Imports Java Input/Output classes for file handling
import java.util.Scanner; // Imports the Scanner class to read user input

public class ALLPROGRAM { // Declares the main public class named ALLPROJECT

    static Scanner input = new Scanner(System.in); // Creates a static Scanner object to read from standard input

    public static void main(String[] args) { // The entry point of the Java application
        char again; // Declares a character variable to store user choice for repeating the loop

        do { // Starts a do-while loop to run the menu-driven system at least once
            System.out.println("\nChoose the program you want to run"); // Prints menu title
            System.out.println(); // Prints an empty line for spacing
            System.out.println("Number 1"); // Displays option for Program 1
            System.out.println("Number 2"); // Displays option for Program 2
            System.out.println("Number 3"); // Displays option for Program 3
            System.out.println("Number 4"); // Displays option for Program 4
            System.out.println("Number 5"); // Displays option for Program 5
            System.out.println("Number 6"); // Displays option for Program 6
            System.out.println("Number 7"); // Displays option for Program 7
            System.out.println(); // Prints another empty line for spacing

            System.out.print("Enter your choice: "); // Prompts the user to enter their choice
            int choice = input.nextInt(); // Reads the integer choice entered by the user
            input.nextLine(); // Consumes the leftover newline character from nextInt()

            switch (choice) { // Evaluates the user's choice to execute the corresponding program
                case 1: // Case for choice 1
                    program1(); // Calls the method program1
                    break; // Exits the switch block
                case 2: // Case for choice 2
                    program2(); // Calls the method program2
                    break; // Exits the switch block
                case 3: // Case for choice 3
                    program3(); // Calls the method program3
                    break; // Exits the switch block
                case 4: // Case for choice 4
                    program4(); // Calls the method program4
                    break; // Exits the switch block
                case 5: // Case for choice 5
                    program5(); // Calls the method program5
                    break; // Exits the switch block
                case 6: // Case for choice 6
                    program6(); // Calls the method program6
                    break; // Exits the switch block
                case 7: // Case for choice 7
                    program7(); // Calls the method program7
                    break; // Exits the switch block
                default: // Executed if choice does not match any cases
                    System.out.println("Invalid choice."); // Prints an error message
            }

            System.out.print("\nDo you want to continue ? Y/N: "); // Asks the user if they want to run another program
            again = input.next().charAt(0); // Reads the first character of the user's input response

        } while (again == 'Y' || again == 'y'); // Loops back if user entered 'Y' or 'y'

        System.out.println("Program ended."); // Prints exit message after leaving the loop
    }

    public static void program1() { // Defines Program 1 method
        double[] numbers = new double[10]; // Declares and allocates an array of 10 real numbers

        System.out.println("\nPROGRAM 1"); // Prints header for Program 1
        System.out.println("Enter 10 real numbers:"); // Instructs the user to enter 10 numbers

        for (int i = 0; i < numbers.length; i++) { // Loops 10 times to collect user inputs
            System.out.print("Number " + (i + 1) + ": "); // Prompts for the current index number
            numbers[i] = input.nextDouble(); // Reads and stores the double value in the array
        }

        double sum = 0; // Initializes the sum of positive numbers to 0
        int positiveCount = 0; // Initializes the counter for positive numbers to 0

        for (int i = 0; i < numbers.length; i++) { // Loops through the array to process positive numbers
            if (numbers[i] > 0) { // Checks if the current number is positive
                sum += numbers[i]; // Adds the positive number to the running sum
                positiveCount++; // Increments the positive number counter
            }
        }

        double average = positiveCount > 0 ? sum / positiveCount : 0; // Computes average of positive numbers, avoiding division by zero

        System.out.println("\nSum of positive numbers: " + sum); // Prints the total sum of positive numbers
        System.out.println("Average of positive numbers: " + average); // Prints the average of positive numbers

        int negativeCount = 0; // Initializes the counter for negative numbers to 0

        for (int i = 0; i < numbers.length; i++) { // Loops through the array to count negative numbers
            if (numbers[i] < 0) { // Checks if the current number is less than zero
                negativeCount++; // Increments the negative counter
            }
        }

        System.out.println("Number of negative numbers: " + negativeCount); // Prints the count of negative numbers

        double minimum = numbers[0]; // Assumes the first element is the minimum initially

        for (int i = 1; i < numbers.length; i++) { // Loops from the second element to find the smallest number
            if (numbers[i] < minimum) { // Checks if the current element is smaller than the current minimum
                minimum = numbers[i]; // Updates the minimum value
            }
        }

        System.out.println("Minimum value: " + minimum); // Prints the minimum value found in the array
    }

    public static void program2() { // Defines Program 2 method
        int[] numbers = new int[8]; // Declares and allocates an array of 8 integers

        System.out.println("\nPROGRAM 2"); // Prints header for Program 2
        System.out.println("Enter 8 integer numbers:"); // Instructs the user to enter 8 integers

        for (int i = 0; i < numbers.length; i++) { // Loops 8 times to collect user inputs
            System.out.print("Number " + (i + 1) + ": "); // Prompts for the current index number
            numbers[i] = input.nextInt(); // Reads and stores the integer in the array
        }

        int[] unique = new int[8]; // Declares a new array to store unique elements
        int uniqueCount = 0; // Initializes the count of unique elements

        for (int i = 0; i < numbers.length; i++) { // Loops through the input numbers array
            boolean duplicate = false; // Flags whether the current element is a duplicate

            for (int j = 0; j < uniqueCount; j++) { // Loops through already recorded unique elements
                if (numbers[i] == unique[j]) { // Checks if current number already exists in unique array
                    duplicate = true; // Sets flag to true if duplicate is found
                    break; // Exits the inner check loop early
                }
            }

            if (!duplicate) { // If the number is not a duplicate
                unique[uniqueCount] = numbers[i]; // Adds it to the unique elements array
                uniqueCount++; // Increments the count of unique elements
            }
        }

        System.out.print("\nArray after removing duplicates: "); // Prints label for unique array

        for (int i = 0; i < uniqueCount; i++) { // Loops through the unique array up to the count
            System.out.print(unique[i] + " "); // Prints each unique element separated by a space
        }

        if (uniqueCount < 2) { // Checks if there are fewer than 2 unique elements
            System.out.println("\nSecond largest element: Not available"); // Cannot find second largest element
            System.out.println("Second smallest element: Not available"); // Cannot find second smallest element
            return; // Exits the method early
        }

        int largest = Integer.MIN_VALUE; // Initializes largest variable to lowest possible integer value
        int secondLargest = Integer.MIN_VALUE; // Initializes second largest variable to lowest possible integer value

        for (int i = 0; i < uniqueCount; i++) { // Loops through the unique numbers
            if (unique[i] > largest) { // If current number is greater than the largest found so far
                secondLargest = largest; // Updates second largest to the previous largest
                largest = unique[i]; // Updates largest to the current number
            } else if (unique[i] > secondLargest && unique[i] != largest) { // If number is between largest and second largest
                secondLargest = unique[i]; // Updates second largest to current number
            }
        }

        int smallest = Integer.MAX_VALUE; // Initializes smallest variable to highest possible integer value
        int secondSmallest = Integer.MAX_VALUE; // Initializes second smallest variable to highest possible integer value

        for (int i = 0; i < uniqueCount; i++) { // Loops through the unique numbers
            if (unique[i] < smallest) { // If current number is smaller than the smallest found so far
                secondSmallest = smallest; // Updates second smallest to the previous smallest
                smallest = unique[i]; // Updates smallest to the current number
            } else if (unique[i] < secondSmallest && unique[i] != smallest) { // If number is between smallest and second smallest
                secondSmallest = unique[i]; // Updates second smallest to current number
            }
        }

        System.out.println("\nSecond largest element: " + secondLargest); // Prints the found second largest element
        System.out.println("Second smallest element: " + secondSmallest); // Prints the found second smallest element
    }

    public static void program3() { // Defines Program 3 method
        System.out.println("\nPROGRAM 3"); // Prints header for Program 3

        System.out.print("Enter Data in Array: "); // Prompts user to input space-separated numbers
        String data = input.nextLine(); // Reads the whole line of user input data

        String[] parts = data.trim().split("\\s+"); // Splits the trimmed string by any whitespace sequence
        int[] numbers = new int[parts.length]; // Creates an integer array of size matching the number of parts

        for (int i = 0; i < parts.length; i++) { // Loops through all string parts
            numbers[i] = Integer.parseInt(parts[i]); // Parses each string into an integer and stores it
        }

        System.out.print("Stored Data in Array: "); // Prints label for input array contents

        for (int number : numbers) { // Enhanced for-loop through the numbers array
            System.out.print(number + " "); // Prints each stored integer

        }

        System.out.println(); // Prints a newline

        System.out.print("Enter poss. of Element to Delete: "); // Prompts for the 1-based index position of the item to delete
        int position = input.nextInt(); // Reads the position

        if (position < 1 || position > numbers.length) { // Validates if the selected position is out of bounds
            System.out.println("Invalid position."); // Prints error message
            return; // Exits the program3 method early
        }

        int[] newArray = new int[numbers.length - 1]; // Creates a new array with size reduced by one

        for (int i = 0, j = 0; i < numbers.length; i++) { // Loops through original array with dual indices
            if (i != position - 1) { // Skips the element at the user-specified deletion index
                newArray[j] = numbers[i]; // Copies valid element to the new array
                j++; // Increments new array write index
            }
        }

        System.out.print("New data in Array: "); // Prints label for updated array

        for (int number : newArray) { // Loops through the updated array
            System.out.print(number + " "); // Prints each updated element
        }

        System.out.println(); // Prints a newline
    }

    public static void program4() { // Defines Program 4 method
        System.out.println("\nPROGRAM 4"); // Prints header for Program 4

        System.out.print("Enter Size of Array: "); // Prompts user for size of the array
        int size = input.nextInt(); // Reads array size

        int[] numbers = new int[size]; // Allocates array with user-specified size

        System.out.println("Enter any " + size + " elements in Array:"); // Prompts user to input elements

        for (int i = 0; i < size; i++) { // Loops 'size' times
            numbers[i] = input.nextInt(); // Stores each integer input in array
        }

        System.out.print("\nEven Elements: "); // Prints label for even elements

        for (int i = 0; i < size; i++) { // Loops through array
            if (numbers[i] % 2 == 0) { // Checks if the number is even (remainder 0 when divided by 2)
                System.out.print(numbers[i] + " "); // Prints the even number
            }
        }

        System.out.print("\nOdd Elements: "); // Prints label for odd elements


        for (int i = 0; i < size; i++) { // Loops through array
            if (numbers[i] % 2 != 0) { // Checks if the number is odd (remainder is not 0)
                System.out.print(numbers[i] + " "); // Prints the odd number
            }
        }

        System.out.println(); // Prints a newline
    }

    public static void program5() { // Defines Program 5 method (asterisk pattern generator)
        int rows = 4; // Sets total number of rows in the pattern to 4

        for (int i = 1; i <= rows; i++) { // Loops from row 1 to row 4
            for (int j = 1; j <= i; j++) { // Loops to print elements in the current row 'i'
                System.out.print("*"); // Prints an asterisk
                // Print 'A' after every asterisk except the last one in the row
                if (j < i) { // Checks if current column is not the last element of current row
                    System.out.print("A"); // Prints character 'A' as separator
                }
            }
            // Move to the next line after completing a row
            System.out.println(); // Ends current line to move to next row pattern
    }
    }

    public static void program6() { // Defines Program 6 method (Student class interaction)
        System.out.println("\nPROGRAM 6"); // Prints header for Program 6

        System.out.println("\n--- Enter details for Student 1 ---"); // Separator for Student 1 input
        Student student1 = new Student(); // Instantiates Student 1 using default constructor

        System.out.print("Enter Student No: "); // Prompts for student 1 number
        student1.setStudentNo(input.nextLine()); // Reads line and sets Student 1 number
        System.out.print("Enter Student Name: "); // Prompts for student 1 name
        student1.setStudentName(input.nextLine()); // Reads line and sets Student 1 name
        System.out.print("Enter Date of Birth (MM/dd/yyyy): "); // Prompts for student 1 birth date
        student1.setDateOfBirth(input.nextLine()); // Reads line and sets Student 1 birth date

        System.out.println("\n--- Enter details for Student 2 ---"); // Separator for Student 2 input
        System.out.print("Enter Student No: "); // Prompts for student 2 number
        String s2No = input.nextLine(); // Reads and stores Student 2 number
        System.out.print("Enter Student Name: "); // Prompts for student 2 name
        String s2Name = input.nextLine(); // Reads and stores Student 2 name
        System.out.print("Enter Date of Birth (MM/dd/yyyy): "); // Prompts for student 2 birth date
        String s2Dob = input.nextLine(); // Reads and stores Student 2 birth date

        Student student2 = new Student(s2No, s2Name, s2Dob, 150); // Instantiates Student 2 using parameterized constructor with tariff points 150

        System.out.println("\n===== Student 1 ====="); // Prints header for Student 1 information
        System.out.println("Student No: " + student1.getStudentNo()); // Prints Student 1 number
        System.out.println("Student Name: " + student1.getStudentName()); // Prints Student 1 name
        System.out.println("Date of Birth: " + student1.getDateOfBirth()); // Prints Student 1 date of birth
        System.out.println("Tariff Points: " + student1.getTariffPoints()); // Prints Student 1 tariff points

        System.out.println("\n===== Student 2 ====="); // Prints header for Student 2 information
        System.out.println("Student No: " + student2.getStudentNo()); // Prints Student 2 number
        System.out.println("Student Name: " + student2.getStudentName()); // Prints Student 2 name
        System.out.println("Date of Birth: " + student2.getDateOfBirth()); // Prints Student 2 date of birth
        System.out.println("Tariff Points: " + student2.getTariffPoints()); // Prints Student 2 tariff points

        System.out.println("\nNumber of Students: " + Student.getNoOfStudents()); // Prints total number of Student instances created via static method
    }

     public static void program7() { // Defines Program 7 method (File Reading)
        System.out.println("\nPROGRAM 7"); // Prints header for Program 7

        File file = new File("C:\\Users\\SBH-CL3-WS01\\Documents\\TEXTFILE.txt"); // Instantiates File object pointing to file path
        try (Scanner reader = new Scanner(file)) { // Uses try-with-resources to open scanner for safe closing
            while (reader.hasNextLine()) { // Loops while there are remaining lines in file
                String data = reader.nextLine(); // Reads the next full line of text from file
                System.out.println(data); // Prints line data to output stream
            }
        } catch (FileNotFoundException e) { // Catches exception if specified file cannot be found
            System.out.println("An error occurred."); // Prints general error message
            e.printStackTrace(); // Outputs the stack trace details
        }
            }
        }
    

class Student { // Defines nested Student helper class

    private String studentNo; // Private property for student number
    private String studentName; // Private property for student name
    private String dateOfBirth; // Private property for date of birth
    private int tariffPoints; // Private property for tariff points

    private static int noOfStudents = 0; // Static counter variable to keep track of Student instances

    public Student() { // Default zero-argument constructor
        this.studentNo = "not known"; // Assigns default placeholder for student number
        this.studentName = "not known"; // Assigns default placeholder for student name
        this.dateOfBirth = "01/01/1995"; // Assigns default date of birth
        this.tariffPoints = 20; // Assigns default low tariff points
        noOfStudents++; // Increments global student counter
    }

    public Student(String studentNo, String studentName, String dateOfBirth, int tariffPoints) { // Parameterized constructor
        this.studentNo = studentNo; // Sets property value from argument studentNo
        this.studentName = studentName; // Sets property value from argument studentName
        this.dateOfBirth = dateOfBirth; // Sets property value from argument dateOfBirth

        if (tariffPoints >= 20 && tariffPoints <= 280) { // Validates tariff points bounds
            this.tariffPoints = tariffPoints; // Assigns tariff points if in valid range
        } else { // Fallback if values are out of bounds
            this.tariffPoints = 20; // Reverts to default value of 20
        }

        noOfStudents++; // Increments global student counter
    }

    public String getStudentNo() { // Getter method for student number
        return studentNo; // Returns value of studentNo
    }

    public void setStudentNo(String studentNo) { // Setter method for student number
        if (studentNo != null && !studentNo.trim().isEmpty()) { // Checks if argument is not null and not empty
            this.studentNo = studentNo; // Sets property value
        }
    }

    public String getStudentName() { // Getter method for student name
        return studentName; // Returns value of studentName
    }

    public void setStudentName(String studentName) { // Setter method for student name
        if (studentName != null && !studentName.trim().isEmpty()) { // Checks if name is non-null and not blank
            this.studentName = studentName; // Sets property value
        }
    }

    public String getDateOfBirth() { // Getter method for date of birth
        return dateOfBirth; // Returns value of dateOfBirth
    }

    public void setDateOfBirth(String dateOfBirth) { // Setter method for date of birth
        if (dateOfBirth != null && !dateOfBirth.trim().isEmpty()) { // Checks if string is non-empty and non-null
            this.dateOfBirth = dateOfBirth; // Sets property value
        }
    }

    public int getTariffPoints() { // Getter method for tariff points
        return tariffPoints; // Returns value of tariffPoints
    }

    public void setTariffPoints(int tariffPoints) { // Setter method for tariff points
        if (tariffPoints >= 20 && tariffPoints <= 280) { // Validates if values are in limits
            this.tariffPoints = tariffPoints; // Sets property value
        }
    }

    public static int getNoOfStudents() { // Static getter to get student class count
        return noOfStudents; // Returns global instance counter value
    }
}