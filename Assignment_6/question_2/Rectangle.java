package q2;
public class Rectangle {
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double calculateArea() {
		double Area = length * breadth;
		return Area;

	}

}
