package q2;
public class Cir_Rec_Sh_Tri_Main {
	public static void main(String[] args) {
		Circle C1 = new Circle(6.36);
		System.out.println(C1.calculateArea());
		Rectangle R1 = new Rectangle(12.6, 10.36);
		System.out.println(R1.calculateArea());
		Triangle T1 = new Triangle(6.00, 9.63);
		System.out.println(T1.calculateArea());
	}

}
