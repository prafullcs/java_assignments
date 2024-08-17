package emply;

public class Employee {
	int ssn;
	String first_name;
	String last_name;
	
	public Employee(int ssn, String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.ssn = ssn;
	}
	
	public void disp() {
		System.out.println("Name: "+ first_name+" "+last_name+ "\nSsn: "+ssn);
	}

}
