package bankcreditcd;

public class BankAccount implements CreditCard {
	@Override
	public void rupees() {
		System.out.println("Converted to Rupees...");
	}
	@Override
	public void dollers() {
		System.out.println("Converted to Dollers...");
	}
	@Override
	public void pounds() {
		System.out.println("Converted to Pounds...");		
	}
}