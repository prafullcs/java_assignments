package assignmet1;

//4.	Java Program to Check Whether a Number is Even or Odd
//

import java.util.Scanner;
public class evenorodd {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter the number");
int num=s.nextInt();
 if(num % 2==0) {
	 System.out.println("number is even");
 }
 else
	 System.out.println("number is odd");
	
}
}
