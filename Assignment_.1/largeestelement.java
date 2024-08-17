package assignmet1;
//	Write a Java program to find the second largest element in an array

public class largeestelement {
	
	    public static void main(String[] args) {
	     int[] arr = {10, 5, 20, 8, 25, 15};
	     int secondLargest = findSecondLargest(arr);
	     System.out.println("The second largest element in the array is: " + secondLargest);
	    }
	    
	    public static int findSecondLargest(int[] arr) {
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }
	        
	        return secondLargest;
	    }
	}

		

