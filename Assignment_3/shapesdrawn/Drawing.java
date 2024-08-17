package shapesdrawn;

import java.util.Scanner;

public class Drawing {
public static void main(String[] args) {
	Shape s;
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the shape 1. [Triangle]\t2. [Rectangle]\t3. [Circle]"); 
	c = sc.nextInt();
	switch (c) {
	case 1: {
	s = new Triangle();
	s.draw();
	break;
	}
	case 2: {
		s = new Rectangle();
		s.draw();
		break;
		}
	case 3: {
		s = new Circle();
		s.draw();
		break;
		}
	default:
		System.out.println("Enter a valid input");
		return;
	}
	}
}
