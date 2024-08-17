package assignmet1;

//Write a Java program to find the maximum and minimum value of an array

public class minandmax {
	  public static void main(String[] args) {
		    int[] arr = {34,66,89,18,40,76,56,90};

		    int max = arr[0];
		    int min = arr[0];
		    
		    for (int i = 1; i < arr.length; i++) {
		      if (arr[i] > max) {
		        max = arr[i];
		      }
		      if (arr[i] < min) {
		        min = arr[i];
		      }
		    }

		    System.out.println("Maximum value of the array: " + max);
		    System.out.println("Minimum value of the array: " + min);
		  }
		}
