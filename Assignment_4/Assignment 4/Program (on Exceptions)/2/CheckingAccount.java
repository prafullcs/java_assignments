package assignment4;  //part1 (program2 of exception)

//User-defined exception class
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//CheckingAccount class
 class CheckingAccount {
 private double balance;

 public CheckingAccount(double initialBalance) {
     balance = initialBalance;
 }

 // Method to withdraw funds
 public void withdraw(double amount) throws InsufficientFundsException {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawal successful. Remaining balance: " + balance);
     } else {
         throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
     }
 }

 // Method to get current balance
 public double getBalance() {
     return balance;
 }
}