package emply;

public class HourlyEmployee extends Employee{
	int salary;
	public HourlyEmployee(String first_name, String last_name, int ssn,int salary) {
		super(ssn,first_name,last_name);
		this.salary =salary;
	}
	
	public void dispSal() {
		System.out.println("Name: "+super.first_name+" "+super.last_name );
		System.out.println("ssn: " +super.ssn);
		System.out.println("Salary: "+salary);
		System.out.println("ComputeNetPay:"+computeNetPay());
	}
	
	public int computeGrossPay() {
		
		return (salary*26*300)*28;
	}
	
	public double computeNetPay() {
		double net_pay = computeGrossPay()-(computeGrossPay()*0.1);
		
		return net_pay;
	}

}
