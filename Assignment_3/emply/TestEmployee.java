package emply;

public class TestEmployee {
	public static void main(String[]args) {
//		Employee e=new Employee(524,"khdg","jrle");
//		e.disp();
		HourlyEmployee s= new HourlyEmployee("prit","Kumar",555,300);
		s.dispSal();
		System.out.println(s.computeGrossPay());
		
	}

}
