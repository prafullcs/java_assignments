package assignmet1;
//3.	Write a java program to reverse the given number.

import java.util.Scanner;

public class reverse{
    public static void main(String[] args) {

int m,n ,sum = 0;
Scanner s = new Scanner(System.in);
System.out.println("enter the number");
m=s.nextInt();
while(m>0) {
	n=m%10;
		sum = sum * 10 + n;
	m=m/10;
}
System.out.println("reserverd nuber :" + sum);
}
}

