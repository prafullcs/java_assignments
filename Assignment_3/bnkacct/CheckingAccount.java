package bnkacct;
public class CheckingAccount extends BankAccount{
	int fee;
	
	public CheckingAccount(int account_number, float total_balance,int fee) {
		super (account_number, total_balance);
		this.fee = fee;
	}
	void deductFee() {
		if(super.transaction>5) {
			super.total_balance -=fee; 
			super.disp();
		}
		else super.total_balance -=100; 
	}
}
