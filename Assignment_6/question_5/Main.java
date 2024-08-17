package q5;
public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount("SA123", 1000, 5);
        Account checkingAccount = new CheckingAccount("CA456", 2000, 500); 

        System.out.println("Initial account details:");
        System.out.println("Savings Account:");
        savingsAccount.display();
        System.out.println("\nChecking Account:");
        checkingAccount.display();
   

        System.out.println("\nPerforming transactions:");
        savingsAccount.deposit(500);
        savingsAccount.display();
        savingsAccount.withdraw(200);
        savingsAccount.display();
        savingsAccount.calculateInterest();
        savingsAccount.display();

        checkingAccount.deposit(1000);
        checkingAccount.display();
        checkingAccount.withdraw(2500); 
        checkingAccount.display();
        checkingAccount.withdraw(1500); 
        checkingAccount.display();

    }
}