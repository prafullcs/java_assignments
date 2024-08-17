package assignment4;  //part2 (program2 of exception)

import java.util.Scanner;

//Main class
public class BankAccountDemo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter initial balance: ");
     double initialBalance = scanner.nextDouble();

     CheckingAccount account = new CheckingAccount(initialBalance);

     System.out.println("Current balance: " + account.getBalance());

     try {
         System.out.print("Enter amount to withdraw: ");
         double withdrawAmount = scanner.nextDouble();
         account.withdraw(withdrawAmount);
     } catch (InsufficientFundsException e) {
         System.out.println("Caught InsufficientFundsException: " + e.getMessage());
     }
 }
}
