package assignmet1;
//	Java Program to Calculate Simple Interest. 
//
import java.util.Scanner;

public class calculator {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the first number ");
 int num=s.nextInt();
 System.out.println("enter the second number ");
 int num2=s.nextInt();
 System.out.println("enter the operator");
 char op = s.next().charAt(0);
   
 switch (op) {
 
 case '+' :
  System.out.println(num +num2);
break;
 case '-':
	 System.out.println(num-num2);
	 break;
 case '*':
	 System.out.println(num*num2);
	 break;
 case '/':
	 System.out.println(num/num2);
	 break;
}
 s.close();
}
}
