package com.mycompany.week10oopmidtermlabact6;

import java.util.ArrayList;
import java.util.Scanner;

// ============================================================================
// 1. HOSPITAL SYSTEM CLASSES (From Program 1)
// ============================================================================
class DateStruct {
    int day;
    int month;
    int year;

    public DateStruct(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

class PatientBase {
    protected String name;
    protected DateStruct dateOfAdmission;
    protected String disease;
    protected DateStruct dateOfDischarge;

    public void enterInformation(Scanner scanner) {
        System.out.print("1. Name of the patient: ");
        this.name = scanner.nextLine();

        System.out.println("2. Date of admission:");
        this.dateOfAdmission = readDate(scanner);

        System.out.print("3. Disease: ");
        this.disease = scanner.nextLine();

        System.out.println("4. Date of discharge:");
        this.dateOfDischarge = readDate(scanner);
    }

    protected DateStruct readDate(Scanner scanner) {
        System.out.print("   Enter Day (DD): ");
        int d = Integer.parseInt(scanner.nextLine());
        System.out.print("   Enter Month (MM): ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("   Enter Year (YYYY): ");
        int y = Integer.parseInt(scanner.nextLine());
        return new DateStruct(d, m, y);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Admission Date: " + dateOfAdmission);
        System.out.println("Disease: " + disease);
        System.out.println("Discharge Date: " + dateOfDischarge);
    }
}

class PatientWithAge extends PatientBase {
    private int age;

    @Override
    public void enterInformation(Scanner scanner) {
        super.enterInformation(scanner);
        System.out.print("5. Age: ");
        this.age = Integer.parseInt(scanner.nextLine());
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Age: " + age);
    }
}

// ============================================================================
// 2. UNIVERSITY SCHOOL SYSTEM CLASSES (From Program 3)
// ============================================================================
class Professor {
    protected String name;
    protected double salary;

    public Professor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Dean extends Professor {
    protected String department;

    public Dean(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getRank() {
        return "Dean";
    }

    @Override
    public String toString() {
        return "Status\n" +
               "Rank: " + getRank() + "\n" +
               "Name: " + name + "\n" +
               "Department: " + department + "\n" +
               "Salary: " + String.format("%.0f", salary);
    }
}

class Executive extends Dean {
    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public String getRank() {
        return "Executive";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

// ============================================================================
// 3. MAIN UNIFIED MANAGEMENT TERMINAL
// ============================================================================
public class WEEK10OOPMIDTERMLABACT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean appRunning = true;

        while (appRunning) {
            System.out.println("\n======================================");
            System.out.println("         MASTER SELECTION MENU        ");
            System.out.println("======================================");
            System.out.println("1. Run Bank Management System");
            System.out.println("2. Run Hospital Patient System");
            System.out.println("3. Run School Management System");
            System.out.println("4. Exit Entire Application");
            System.out.println("--------------------------------------");
            System.out.print("Choice: ");
            
            String masterChoice = scanner.nextLine().trim();

            switch (masterChoice) {
                case "1":
                    runBankSystem(scanner);
                    break;
                case "2":
                    runHospitalSystem(scanner);
                    break;
                case "3":
                    runSchoolSystem(scanner);
                    break;
                case "4":
                    System.out.println("Shutting down Application. Goodbye!");
                    appRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
                    break;
            }
        }
        scanner.close();
    }

    // ==========================================
    // MODULE 1: BANK SUB-SYSTEM
    // ==========================================
    private static void runBankSystem(Scanner scanner) {
        System.out.println("\n--- BANK MANAGEMENT SYSTEM ---");
        System.out.print("Enter your balance: ");
        int balance;
        try {
            balance = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid format. Returning to master menu.");
            return;
        }

        boolean bankRunning = true;

        while (bankRunning) {
            System.out.println("--------------------------------------");
            System.out.println("Select an option:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Return to Master Menu");
            System.out.println("--------------------------------------");
            System.out.print("Choice: ");
            
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("How much amount you want to withdraw from your account?");
                    System.out.print("Amount: ");
                    try {
                        int withdrawAmount = Integer.parseInt(scanner.nextLine());
                        if (withdrawAmount > balance) {
                            System.out.println("Transaction Rejected: Insufficient balance.");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Your new balance is: " + balance);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount entry.");
                    }
                    break;

                case "2":
                    System.out.println("How much amount you want to deposit in your account?");
                    System.out.print("Amount: ");
                    try {
                        int depositAmount = Integer.parseInt(scanner.nextLine());
                        balance += depositAmount;
                        System.out.println("Your new balance is: " + balance);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount entry.");
                    }
                    break;

                case "3":
                    System.out.println("Returning to Master Selection Menu...");
                    bankRunning = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
                    break;
            }
        }
    }

    // ==========================================
    // MODULE 2: HOSPITAL SUB-SYSTEM
    // ==========================================
    private static void runHospitalSystem(Scanner scanner) {
        ArrayList<PatientWithAge> database = new ArrayList<>();
        boolean hospitalRunning = true;

        while (hospitalRunning) {
            System.out.println("\n--- HOSPITAL PATIENT SYSTEM ---");
            System.out.println("1. Insert New Patient");
            System.out.println("2. Display all Patients");
            System.out.println("3. Display pediatric patients");
            System.out.println("4. Return to Master Menu");
            System.out.print("Choice: ");
            
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("\n[Inserting New Patient Details]");
                    try {
                        PatientWithAge newPatient = new PatientWithAge();
                        newPatient.enterInformation(scanner);
                        database.add(newPatient);
                        System.out.println("Patient added successfully!");
                    } catch (NumberFormatException e) {
                        System.out.println("Input format error. Numeric expected. Registration canceled.");
                    }
                    break;

                case "2":
                    System.out.println("\n--- ALL PATIENT RECORDS ---");
                    if (database.isEmpty()) {
                        System.out.println("No patient data found.");
                    } else {
                        for (int i = 0; i < database.size(); i++) {
                            System.out.println("\nPatient #" + (i + 1) + ":");
                            database.get(i).display();
                        }
                    }
                break;
                case "3":
                    
                System.out.println("\n--- PEDIATRIC PATIENTS (< 12 Years Old) ---");
                
                boolean foundPediatric = false;
                
                for (PatientWithAge p : database) {
                    if (p.getAge() < 12) {
                        p.display();
                        System.out.println("-------------------------");
                        foundPediatric = true;
                    }
                }
                if (!foundPediatric) {
                System.out.println("No pediatric patients found matching standard thresholds.");
                }
                break;
                case "4":
                System.out.println("Returning to Master Selection Menu...");
                hospitalRunning = false;
                break;
                default:
                System.out.println("Invalid choice. Please select options 1-4.");
                break;
            }
        }
    }
    // ==========================================
    // MODULE 3: SCHOOL SUB-SYSTEM
    // ==========================================
    private static void runSchoolSystem(Scanner scanner) {
        ArrayList membersList = new ArrayList<>();
        boolean schoolRunning = true;
        System.out.println("\nWelcome to the University Management System");
            while (schoolRunning) {
                System.out.println("\n-----------------------------------------");
                System.out.println("Select Role to Add:");
                System.out.println("1. Add a Dean");
                System.out.println("2. Add an Executive");
                System.out.println("3. Display All Added Records");
                System.out.println("4. Return to Master Menu");
                System.out.print("Choice: ");
                String choice = scanner.nextLine().trim();
        switch (choice) {
            case "1":
            case "2":
                String selectedRole = choice.equals("1") ? "Dean" : "Executive";
                System.out.println("\n--- Entering details for " + selectedRole + " ---");
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Department: ");
                String department = scanner.nextLine();
                double salary = 0;
                while (true) {
                    try {
                    System.out.print("Enter Salary: ");
                    salary = Double.parseDouble(scanner.nextLine());
                    if (salary >= 0) break;
                        System.out.println("Salary cannot be negative.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid numeric amount. Try again.");
                    }
                }
                
                if (choice.equals("1")) {
                    membersList.add(new Dean(name, salary, department));
                } else {
                    membersList.add(new Executive(name, salary, department));
                }
                System.out.println(selectedRole + " added successfully!");
                break;
                
            case "3":
                System.out.println("\n=== PRINTING ALL CURRENT RECORDS ===");
                if (membersList.isEmpty()) {
                    System.out.println("No records found in database.");
                } else {
                for (int i = 0; i < membersList.size(); i++) {
                        System.out.println(membersList.get(i));
                    if (i < membersList.size() - 1) {
                        System.out.println("-----------------------------------------");
                    }
                }
                }
                break;
            case "4":
                System.out.println("Returning to Master Selection Menu...");
                schoolRunning = false;
                break;
            default:
                System.out.println("Invalid choice. Please select options 1-4.");
                break;
        }
            }
    }
}
                        
   