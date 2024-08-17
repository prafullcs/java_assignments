package assignmet1;
import java.util.Scanner;
//	Java Program to Print Pyramid Number Pattern

public class pyramid {
//	// write a main method 
	  public static void main(String args[]) {
	    
// this program  contain two loops 

	    int row, col, numberOfRows;
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the number of rows: ");
	    numberOfRows = scanner.nextInt();
	    for(row = 1; row <= numberOfRows; row++) {
	      for(col = 1; col <= row; col++) {
	        System.out.print(col + " ");
	      }
	      System.out.println();
	    }
	  }
	
}
