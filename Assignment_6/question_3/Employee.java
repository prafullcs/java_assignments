package q3;
abstract class Employee {
	public String name;
	public double baseSalary;

	    Employee(String name, double baseSalary) {
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }

	    abstract double calculateSalary();
	}


