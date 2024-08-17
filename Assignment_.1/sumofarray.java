package assignmet1;

//	Write a Java program to sum values of an array.

public class sumofarray {
	
		  public static void main(String[] args) {
		    int[] arr = {51, 32, 43, 94, 92, 150};
		    int sum = 0;

		    // Calculate the sum of the array elements
		    for (int i = 0; i < arr.length; i++) {
		      sum += arr[i];
		    }

		    System.out.println("sum of the array elements: " + sum);
		  }
		}

