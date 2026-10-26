package com.mycompany.week10oopmidtermlabact4;


import java.util.Scanner;


public class WEEK10OOPMIDTERMLABACT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 1. Employee Information
        System.out.println("--- Enter Employee Information ---");
        System.out.print("Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Employee ID: ");
        String employeeId = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Basic Monthly Salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left over


        // 2. Payroll Information
        System.out.println("\n--- Enter Payroll Information ---");
        System.out.print("Payroll Start Date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.print("Payroll End Date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        System.out.print("Payout Date (YYYY-MM-DD): ");
        String payoutDate = scanner.nextLine();


        // 3. Work Details
        System.out.println("\n--- Enter Work Details ---");
        System.out.print("Total Regular Hours Worked: ");
        double regularHours = scanner.nextDouble();
        System.out.print("Overtime Hours Worked: ");
        double overtimeHours = scanner.nextDouble();
        System.out.print("Number of Absent Days: ");
        int absentDays = scanner.nextInt();


        // 4. Allowances
        System.out.println("\n--- Enter Allowances ---");
        System.out.print("Rice Allowance: ");
        double riceAllowance = scanner.nextDouble();
        System.out.print("Transportation Allowance: ");
        double transAllowance = scanner.nextDouble();
        System.out.print("Communication Allowance: ");
        double commAllowance = scanner.nextDouble();


        // 5. Deductions
        System.out.println("\n--- Enter Deductions ---");
        System.out.print("SSS Contribution: ");
        double sss = scanner.nextDouble();
        System.out.print("PhilHealth Contribution: ");
        double philHealth = scanner.nextDouble();
        System.out.print("PAG-IBIG Contribution: ");
        double pagIbig = scanner.nextDouble();
        System.out.print("Withholding Tax: ");
        double tax = scanner.nextDouble();
        System.out.print("Other Deductions: ");
        double otherDeductions = scanner.nextDouble();


        // --- Computation and Business Logic ---
        double hourlyRate = basicSalary / 160.0;
        double dailyRate = basicSalary / 20.0;
        
        double regularPay = regularHours * hourlyRate;
        double overtimePay = overtimeHours * (hourlyRate * 1.25);
        double absenceDeduction = absentDays * dailyRate;
        
        double totalAllowances = riceAllowance + transAllowance + commAllowance;
        double grossPay = regularPay + overtimePay + totalAllowances;
        
        double totalDeductions = sss + philHealth + pagIbig + tax + otherDeductions + absenceDeduction;
        double netPay = grossPay - totalDeductions;


        // --- Output Requirements (Formatted Payslip) ---
        System.out.println("\n******************************************");
        System.out.println("***      Smart Employee Payslip        ***");
        System.out.println("******************************************");
        
        System.out.println("Employee Details");
        System.out.printf("  %-25s: %s\n", "Name", name);
        System.out.printf("  %-25s: %s\n", "Employee ID", employeeId);
        System.out.printf("  %-25s: %s\n", "Department", department);
        System.out.println("------------------------------------------");
        
        System.out.println("Payroll Summary");
        System.out.printf("  %-25s: %s to %s\n", "Pay Period", startDate, endDate);
        System.out.printf("  %-25s: %s\n", "Payout Date", payoutDate);
        System.out.println("------------------------------------------");
        
        System.out.println("Earnings");
        System.out.printf("  %-25s: Php %,.2f\n", "Regular Pay", regularPay);
        System.out.printf("  %-25s: Php %,.2f\n", "Overtime Pay", overtimePay);
        System.out.printf("  %-25s: Php %,.2f\n", "Total Allowances", totalAllowances);
        System.out.printf("  %-25s: Php %,.2f\n", "Gross Pay", grossPay);
        System.out.println("------------------------------------------");
        
        System.out.println("Allowances Breakdown");
        System.out.printf("  %-25s: Php %,.2f\n", "Rice Allowance", riceAllowance);
        System.out.printf("  %-25s: Php %,.2f\n", "Transportation Allowance", transAllowance);
        System.out.printf("  %-25s: Php %,.2f\n", "Communication Allowance", commAllowance);
        System.out.println("------------------------------------------");
        
        System.out.println("Deductions");
        System.out.printf("  %-25s: Php %,.2f\n", "SSS", sss);
        System.out.printf("  %-25s: Php %,.2f\n", "PhilHealth", philHealth);
        System.out.printf("  %-25s: Php %,.2f\n", "PAG-IBIG", pagIbig);
        System.out.printf("  %-25s: Php %,.2f\n", "Withholding Tax", tax);
        System.out.printf("  %-25s: Php %,.2f\n", "Absence Deduction", absenceDeduction);
        System.out.printf("  %-25s: Php %,.2f\n", "Other Deductions", otherDeductions);
        System.out.printf("  %-25s: Php %,.2f\n", "Total Deductions", totalDeductions);
        System.out.println("------------------------------------------");
        
        System.out.printf("NET PAY                    : Php %,.2f\n", netPay);
        System.out.println("******************************************");
        
        scanner.close();
    }
}