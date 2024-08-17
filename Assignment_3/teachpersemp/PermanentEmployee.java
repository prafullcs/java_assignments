package teachpersemp;

public class PermanentEmployee extends Employee {

	public PermanentEmployee(String name, int age, String profession) {
		super(name, age, profession);
	}
	
	public void showProfession() {
		super.profession+="(Permanent)";
		super.dispInfo();
	} 

}
