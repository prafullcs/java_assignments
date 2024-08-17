import java.util.Scanner;
class BankAccount {
	int accountNumber;
	double totalBalance;
	
	public BankAccount(int accountNumber, double totalBalance) {
		this.accountNumber = accountNumber;
		this.totalBalance = totalBalance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	public double deposit(double d) {
		if (d > 0) return totalBalance + d;
		return totalBalance;
	}
	
	public double withdraw(double w) {
		if (w > totalBalance || w < 0) return totalBalance;
		return totalBalance - w;
	}
	
}

class SavingAccount extends BankAccount {
	double interestRate;
	
	public SavingAccount(int accountNumber, double totalBalance, double interestRate) {
		super(accountNumber, totalBalance);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double addInterest(double interestRate, double time) {
		if (interestRate <= 0 || time <= 0) {
			return totalBalance;
		} else {
		double si = (totalBalance * interestRate * time) / 100;
		return totalBalance + si;
		}
	}
}

class CheckingAccount extends BankAccount {
	double fee;
	
	public CheckingAccount(int accountNumber, double totalBalance, double fee) {
		super(accountNumber, totalBalance);
		this.fee = fee;
	}
	
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public double deductFee(double fee) {
		if (fee < 0 && fee > totalBalance) return totalBalance;
		return totalBalance - fee;
	}
}

public class PS5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Account Number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter Balance: ");
		double totalBalance = sc.nextDouble();
		
		System.out.println("Choose any of the following by entering the number:");
		System.out.println("1. Checking");
		System.out.println("2. Savings");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Balance");
		int input = sc.nextInt();

		switch(input) {
			case 1:
				System.out.print("Enter Fees: ");
				double fee = sc.nextDouble();
				CheckingAccount ca = new CheckingAccount(accountNumber, totalBalance, fee);
				if (ca.deductFee(fee) == totalBalance) {
					System.out.println("Invalid Fees Entered");
				} else {
					System.out.println("Final Balance is " + ca.deductFee(fee));
				}
				break;
			case 2:
				System.out.print("Enter Rate of Interest: ");
				double interestRate = sc.nextDouble();
				System.out.print("Enter Time Period: ");
				double time = sc.nextDouble();
				SavingAccount sa = new SavingAccount(accountNumber, totalBalance, interestRate);
				if (sa.addInterest(interestRate, time) == totalBalance) {
					System.out.println("Invalid Entries");
				} else {
					System.out.println("Amount after Interest is " + sa.addInterest(interestRate, time));
				}
				break;
			case 3:
				System.out.print("Enter amount of money to add: ");
				double d = sc.nextDouble();
				BankAccount ba = new BankAccount(accountNumber, totalBalance);
				if (ba.deposit(d) == totalBalance) {
					System.out.println("Invalid Amount Entered.");
				} else {
					System.out.println("Rs. " + d + " deposited.");
					System.out.println("Balance: " + ba.deposit(d));
				}
				break;
			case 4:
				System.out.print("Enter amount of money to withdraw: ");
				double w = sc.nextDouble();
				BankAccount ba1 = new BankAccount(accountNumber, totalBalance);
				if (ba1.withdraw(w) == totalBalance) {
					System.out.println("Invalid Amount Entered.");
				} else {
					System.out.println("Rs. " + w + " withdrawn.");
					System.out.println("Balance: " + ba1.withdraw(w));
				}
				break;
			case 5:
				System.out.println("Balance : " + totalBalance);
				break;
			default:
				System.out.println("Wrong Number Entered");
				break;
		}
	}

}