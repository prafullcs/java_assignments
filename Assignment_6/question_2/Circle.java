package q2;
public class Circle extends shape{
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}




	public double calculateArea(){
		double Area = 3.14* radius * radius;
		return Area;
	}


}
