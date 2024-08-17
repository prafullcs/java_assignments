package emply;

public class SalariedEmployee extends Employee {
	int salary;
	public SalariedEmployee(int ssn,String first_Name,String last_Name,int Salary)
	{
		super(ssn,first_Name,last_Name);
		this.salary=Salary;
	}
	public void dispPay() {
		System.out.println("Monthly Salary:"+salary);
		
	}
	public void grossPay()
	{
		System.out.println("Gross Pay:"+salary*31);
	}
	public void netPay()
	{
		float pf=0.05f;
		System.out.println("Net Pay:"+(salary-(pf*salary)));
	}		
	

}
