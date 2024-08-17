package assignmet1;
//Write a java program  to  print Table of given  Number 
import java.util.Scanner;
public class table {
	
	  public static void main(String args[]) {
	    int num, multiplier, result ;
	    Scanner sca = new Scanner(System.in);

	    System.out.print("Enter the number for table: ");
	    num = sca.nextInt();

	    System.out.println("table of " + num + ":");
	    for(multiplier = 1; multiplier <= 10; multiplier++) {
	      result = num * multiplier;
	      System.out.println(num + " x " + multiplier + " = " + result);
	    }
	  }
	}

