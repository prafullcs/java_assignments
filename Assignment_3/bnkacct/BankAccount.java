 package bnkacct;

public class BankAccount {
	int account_number;
	float total_balance;
	int transaction;
	
	public BankAccount(int account_number, float total_balalnce) {
		this.account_number = account_number;
		this.total_balance = total_balalnce;
		disp();
	}
	
	public void disp() {
	System.out.println("Account Number: "+account_number+" Total Balance: "+total_balance);	
	}
	
	public void deposit(int amount) {
		total_balance += amount;
		System.out.println("Account Balance: "+total_balance);
	}
	
	public void withdraw(int amount) {
		if(amount>total_balance) {
			System.out.println("Insufficient Funds");
		}
		else {
			total_balance-=amount;
			System.out.println("Withdrawn amount: "+amount);
			System.out.println("Account Balance: "+total_balance);
			transaction++;
		}
	}

}
