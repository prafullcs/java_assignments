package assignmet1;

//6.	Java Program to Print Right Triangle Star Pattern
 
// declares a new Java class called "right star 
public class rightStar {
	
	// main method 
		  public static void main(String args[]) {
		    
	// we uses two nested for loops to print the triangle. 
	
			  int row, column, numberOfRows=10;
		    for(row=0; row<numberOfRows; row++) {
		      for(column=0; column<=row; column++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		  }
		}
