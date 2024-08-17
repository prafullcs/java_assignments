import java.util.Scanner;

class Triangle{
	double side;
	public Triangle(double side) {
		this.side = side;
	}

	public double calculateArea() {
		return (((Math.sqrt(3))/4)) * side * side;
	}
	
}

class Square{
	double side;
	public Square(double side) {
		this.side = side;
	}

	public double calculateArea() {
		return side * side;
	}
	
}

class Circle {
	double side;
	public Circle(double side) {
		this.side = side;
	}

	public double calculateArea() {
		return Math.PI * side * side;
	}
	
}
public class PS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side: ");
		double side = sc.nextDouble();
		System.out.println("Choose any number:");
		System.out.println("1. Triangle");
		System.out.println("2. Square");
		System.out.println("3. Circle");
		int input = sc.nextInt();
		switch(input){
			case 1:
				Triangle t = new Triangle(side);
				System.out.println("Area of Triangle is " + t.calculateArea() + " sq. units.");
				break;
			case 2:
				Square s = new Square(side);
				System.out.println("Area of Square is " + s.calculateArea() + " sq. units.");
				break;
			case 3:
				Circle c = new Circle(side);
				System.out.println("Area of Circle is " + c.calculateArea() + " sq. units.");
				break;
			default:
				System.out.println("Wrong number entered. Please Try Again.");
				break;
		}
	}
}