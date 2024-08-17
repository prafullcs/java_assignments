package assignment2;

import java.util.Scanner;
//Write a Java program that creates a  account classs with instance variable accno ,
// accname,amount and instance method  withdraw, deposit, and  interest. Create object of account class test all methods.

public class Account {
    int accNo;
    String accName;
    double amount;

    // Constructor
    public Account(int accNo, String accName, double amount) {
        this.accNo = accNo;
        this.accName = accName;
        this.amount = amount;
    }

    // Method to withdraw amount
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > 0 && withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
            System.out.println("Withdrawal successful. Current balance: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            amount += depositAmount;
            System.out.println("Deposit successful. Current balance: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to calculate interest
    public double calculateInterest(double rate) {
        return amount * rate / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number:");
        int accNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter account name:");
        String accName = scanner.nextLine();

        System.out.println("Enter initial amount:");
        double amount = scanner.nextDouble();

        Account account = new Account(accNo, accName, amount);

        // Testing withdraw method
        System.out.println("Enter withdrawal amount:");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Testing deposit method
        System.out.println("Enter deposit amount:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Testing interest calculation
        System.out.println("Enter interest rate:");
        double interestRate = scanner.nextDouble();
        double interest = account.calculateInterest(interestRate);
        System.out.println("Interest earned: " + interest);

        scanner.close();
    }
}
