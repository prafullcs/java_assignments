package commisalaryemp;
public class HourlyEmployee extends Employee {
	double wage;
	double hours;
	
	public HourlyEmployee(String name, String ssn,double wage, double hours) {
		super(name, ssn);
		this.hours = hours;
		this.wage = wage;
	}
	
	public void dispInfo() {
		System.out.println("Name: "+super.name);
		System.out.println("SSN: "+super.ssn);
		System.out.println("Salary: "+salary());
	}
	
	
	public double salary() {
		
		return wage*hours;
	}
	
	public String toString() {
		dispInfo();
		return " Salary = "+ (salary());
	}

}
