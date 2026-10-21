package com.mycompany.bankingapp;

import java.util.Scanner;

// ==========================================
// 1. ABSTRACT CLASS: ACCOUNT (Abstraction & Encapsulation)
// ==========================================
abstract class Account {
    // Encapsulated private fields
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Read-only getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Core transaction logic keeps balance arithmetic hidden inside the class
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return;
        }
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return false;
        }

        double fee = calculateWithdrawalFee();
        if (this.balance < (amount + fee)) {
            System.out.println("Transaction Rejected: Insufficient balance to cover the amount and its fee.");
            return false;
        }

        this.balance -= (amount + fee);
        return true;
    }

    // Abstract methods to be overridden by subclasses (Polymorphism)
    public abstract double calculateWithdrawalFee();
    public abstract String getAccountType();
}

// ==========================================
// 2. SUBCLASS: SAVINGS ACCOUNT (Inheritance)
// ==========================================
class SavingsAccount extends Account {
    
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateWithdrawalFee() {
        return 0.0; // SavingsAccount has no withdrawal fee
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}

// ==========================================
// 3. SUBCLASS: CHECKING ACCOUNT (Inheritance)
// ==========================================
class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateWithdrawalFee() {
        return 10.0; // CheckingAccount charges a flat ₱10 fee
    }

    @Override
    public String getAccountType() {
        return "Checking";
    }
}

// ==========================================
// 4. MAIN APPLICATION CLASS: BANKING APP
// ==========================================
public class BankingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the OOP Banking System");
        System.out.print("Opening balance: ");
        double openingBalance = readNonNegativeBalance(scanner);

        // Instantiate separate account objects with their own balances
        SavingsAccount savingsAccount = new SavingsAccount("SA-101", openingBalance);
        CheckingAccount checkingAccount = new CheckingAccount("CA-202", openingBalance);

        // Polymorphic reference assignment
        Account selectedAccount = savingsAccount;

        boolean running = true;
        while (running) {
            printAccountSummary(selectedAccount);
            showMenu();
            
            System.out.print("Choice: ");
            String choiceInput = scanner.nextLine().trim();

            switch (choiceInput) {
                case "1": // Withdraw
                    System.out.print("Amount to withdraw: ");
                    double withdrawAmount = readPositiveAmount(scanner);
                    if (withdrawAmount > 0) {
                        double fee = selectedAccount.calculateWithdrawalFee();
                        // Perform withdrawal evaluation using polymorphic call
                        if (selectedAccount.withdraw(withdrawAmount)) {
                            System.out.printf("Withdrawal fee: P%.2f | New %s balance: P%.2f\n", 
                                    fee, selectedAccount.getAccountType(), selectedAccount.getBalance());
                        }
                    }
                    break;

                case  "2": // Deposit
                    System.out.print("Amount to deposit: ");
                    double depositAmount = readPositiveAmount(scanner);
                    if (depositAmount > 0) {
                        selectedAccount.deposit(depositAmount);
                        System.out.printf("New %s balance: P%.2f\n", 
                                selectedAccount.getAccountType(), selectedAccount.getBalance());
                    }
                    break;

                case "3": // Show balance
                    System.out.printf("Current %s balance: P%.2f\n", 
                            selectedAccount.getAccountType(), selectedAccount.getBalance());
                    break;

                case "4": // Switch account
                    if (selectedAccount == savingsAccount) {
                        selectedAccount = checkingAccount;
                    } else {
                        selectedAccount = savingsAccount;
                    }
                    break;

                case "5": // Exit
                    System.out.println("Thank you for using the system!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid menu choice. Please select a number from 1 to 5.");
                    break;
            }
        }
        scanner.close();
    }

    // Helper method templates required by prompt specs
    public static void showMenu() {
        System.out.println("1 Withdraw   2 Deposit   3 Show balance   4 Switch account   5 Exit");
    }

    public static double readNonNegativeBalance(Scanner scanner) {
        while (true) {
            try {
                double val = Double.parseDouble(scanner.nextLine());
                if (val >= 0) {
                    return val;
                }
                System.out.print("Balance cannot be negative. Try again: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }

    public static double readPositiveAmount(Scanner scanner) {
        try {
            double val = Double.parseDouble(scanner.nextLine());
            if (val > 0) {
                return val;
            }
            System.out.println("Invalid input: Amount must be greater than zero.");
            return -1;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a clear numerical format.");
            return -1;
        }
    }

    public static void printAccountSummary(Account account) {
        System.out.printf("Current account: %s | Balance: P%.2f\n", 
                account.getAccountType(), account.getBalance());
    }
}
