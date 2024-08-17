package teachpersemp;

public class Employee extends Person {
	String profession;
	
	public Employee(String name, int age, String profession) {
		super(name, age);
		this.profession = profession;
	}
	
	public void dispInfo() {
		System.out.println("Name: "+name+" Age:"+age+" Profession:"+profession);
	}
	
	public void showProfession() {
		System.out.println("Profession: "+profession);
	}

}
