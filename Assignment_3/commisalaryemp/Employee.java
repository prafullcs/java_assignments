package commisalaryemp;
public class Employee {

	String name; 
	String ssn;
	
	public Employee(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public double salary() {
		return 0;
	}
	
	public String toString() {
		return "Name: "+name+" SSN: "+ssn + salary();
	}
	
}
