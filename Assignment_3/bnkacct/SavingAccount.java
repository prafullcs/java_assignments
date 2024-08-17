package bnkacct;

public class SavingAccount extends BankAccount {
	float interest_rate;
	
	public SavingAccount(int account_number,float total_balance, float interest_rate) {
		super(account_number, total_balance);
		this.interest_rate = interest_rate;
		disp();
	}
	 void addInterest() {
		 float interest = (interest_rate * total_balance)/100;
		 total_balance += interest;
		 System.out.println();
	 }
}
