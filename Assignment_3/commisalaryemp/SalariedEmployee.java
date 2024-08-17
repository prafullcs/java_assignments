package commisalaryemp;

public class SalariedEmployee extends Employee{
	
	int basic_salary;
	
	public SalariedEmployee(String name, String ssn, int basic_salary) {
		
		super(name,ssn);
		this.basic_salary = basic_salary;
		
	}
	
	public void dispInfo() {
		System.out.println("Name: "+super.name);
		System.out.println("SSN: "+super.ssn);
		System.out.println("Salary: "+salary());
	}
	
	public double salary() {
		return basic_salary;
	}
	
	public String toString() {
		dispInfo();
		return  " Salary = "+salary();
	}

}
