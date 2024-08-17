package commisalaryemp;
public class CommissionEmployee extends Employee {
	
	double sales;
	double commission;
	
	public CommissionEmployee(String name, String ssn,double sales, double commission) {
		super(name,ssn);
		this.commission= commission;
		this.sales = sales;
	}
	
	public void dispInfo() {
		System.out.println("Name: "+super.name);
		System.out.println("SSN: "+super.ssn);
		System.out.println("Salary: "+salary());
	}
	
	
	public double salary() {
		return commission*sales;
	}
	
	
	public String toString() {
		dispInfo();
		return " Salary = "+ (salary());
	}
	
}
