package q2;
public class Triangle {
	double base;
	double height;

	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;

	}
	

	double calculateArea(){
		double Area = 0.5*base*height;
		return Area;
	
	}
}