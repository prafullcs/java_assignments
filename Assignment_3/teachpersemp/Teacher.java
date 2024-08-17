package teachpersemp;

public class Teacher extends Person {
	String profession;
	public Teacher(String name, int age, String profession) {
		super(name,age);
		this.profession = profession;
	}
	public void dispInfo() {
		System.out.println("Name: "+name+" Age: "+age+" Profession: "+profession);
	}
	
	public void myProfession() {
		System.out.println("My Profession: "+profession);
	}
}
