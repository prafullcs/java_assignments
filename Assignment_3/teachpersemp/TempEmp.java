package teachpersemp;

public class TempEmp extends Employee{

	public TempEmp(String name, int age, String profession) {
		super(name, age, profession);
	}
	
	public void showProfession() {
		super.profession+="(Temprary)";
		super.dispInfo();
	} 	
}