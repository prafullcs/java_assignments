class Employee {
	int empid;
	String name;
	double salary;
	
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public double calculateSalary(double taxes) {
		if (taxes < 0 || taxes > salary) {
			return salary;
		} else {
			return salary - taxes;
		}
	}
}

class Manager {
	Employee em;
	
	public Manager(Employee em) {
		this.em = em;
	}
	
	public double calculateSalary(double taxes) {
		if (taxes < 0 || taxes > em.salary) {
			return em.salary;
		} else {
			return em.salary - taxes;
		}
	}
}

class Engineer {
	Employee em;
	
	public Engineer(Employee em) {
		this.em = em;
	}
	
	public double calculateSalary(double taxes) {
		if (taxes < 0 || taxes > em.salary) {
			return em.salary;
		} else {
			return em.salary - taxes;
		}
	}
}
public class PS3 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Ajay", 40000);
		Employee e2 = new Employee(1002, "Ankit", 80000);
		Employee e3 = new Employee(1003, "John", 20000);
		Manager m = new Manager(e2);
		Engineer e = new Engineer(e3);
		System.out.println("Employee Net Salary is " + e1.calculateSalary(5000));
		System.out.println("Manager Net Salary is " + m.calculateSalary(10000));
		System.out.println("Engineer Net Salary is " + e.calculateSalary(2000));
	}
}
