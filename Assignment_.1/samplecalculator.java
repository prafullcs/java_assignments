package assignmet1;
import java.util.Scanner;
//	Java Program to Make a Simple Calculator Using switch...case

public class samplecalculator {
	
	  public static void main(String args[]) {
	    int choice;
        int  num1, num2, result;
	    Scanner scan = new Scanner(System.in);

	    System.out.println("Simple Calculator");
	    System.out.println("1. Addition");
	    System.out.println("2. Subtraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    System.out.print("enter your choice (1 to 4): ");
	    choice = scan.nextInt();

	    System.out.print("enter first number: ");
	    num1 = scan.nextInt();

	    System.out.print("enter second number: ");
	    num2 = scan.nextInt();

	    switch (choice) {
	      case 1:
	        result = num1 + num2;
	        System.out.println("result: " + num1 + " + " + num2 + " = " + result);
	        break;
	      case 2:
	        result = num1 - num2;
	        System.out.println("result: " + num1 + " - " + num2 + " = " + result);
	        break;
	      case 3:
	        result = num1 * num2;
	        System.out.println("result: " + num1 + " * " + num2 + " = " + result);
	        break;
	      case 4:
	        if (num2 != 0) {
	          result = num1 / num2;
	          System.out.println("result: " + num1 + " / " + num2 + " = " + result);
	        } else {
	          System.out.println("Error: Division by zero!");
	        }
	        break;
	      default:
	        System.out.println("Invalid choice!");
	    }
	  }
	}

