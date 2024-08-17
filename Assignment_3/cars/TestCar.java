package cars;

import java.util.Scanner;

public class TestCar {
	public static void main(String[] args) {
		Car c;
		int cn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car you want to drive in...");
		cn = sc.nextInt();
		switch (cn) {
		case 1: {
			c= new MarutiCar();
			c.speed();
			break;
		}
		case 2: {
			c= new AltoCar();
			c.speed();
			break;
		}
		case 3: {
			c= new Brezza();
			c.speed();
			break;
		}
		default:
			System.out.println("enter valid input");
			return;
		}
		
	}

}
