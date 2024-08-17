package assignmet1;
import java.util.Scanner;
//  Write Java Program  to  Find Largest of Three Numbers

public class largestthree {
	 public class LargestThree {
	  public static void main(String args[]) {
	    int num1, num2, num3, largest;
	    Scanner scan = new Scanner(System.in);

	    System.out.print("enter first number: ");
	    num1 = scan.nextInt();

	    System.out.print("enter second number: ");
	    num2 = scan.nextInt();

	    System.out.print("enter third number: ");
	    num3 = scan.nextInt();

	    // Find the largest number
	    
	    if (num1 >= num2 && num1 >= num3) {
	      largest = num1;
	    } else if (num2 >= num1 && num2 >= num3) {
	      largest = num2;
	    } else {
	      largest = num3;
	    }

	    System.out.println("largest number is: " + largest);
	  }
	}
}
