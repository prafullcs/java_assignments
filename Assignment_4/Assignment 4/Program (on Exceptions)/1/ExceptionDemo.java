package assignment4;  //program1_of_exception

public class ExceptionDemo {                 

	 public static void main(String[] args) {
	
	try {
        // a) Multiple catch blocks
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[4]); // This line will throw an ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index out of bounds error occurred.");
    } catch (ArithmeticException e) {
        System.out.println("Arithmetic exception occurred.");
    } finally {
        System.out.println("Finally block is always executed.");
    }
    
    try {
        // b) try-catch-finally combination
        int result = divide(10, 0); // This will throw ArithmeticException
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero.");
    } finally {
        System.out.println("Finally block is always executed.");
    }
    
    try {
        // c) try-finally combination
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[4]); // This line will throw an ArrayIndexOutOfBoundsException
    } finally {
        System.out.println("Finally block is always executed.");
    }
    
    try {
        // d) Nested try blocks
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // This line will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inner catch block: Array index out of bounds error occurred.");
        }
    } catch (ArithmeticException e) {
        System.out.println("Outer catch block: Arithmetic exception occurred.");
    }
}

// Method to demonstrate throwing an exception
public static int divide(int dividend, int divisor) throws ArithmeticException {
    if (divisor == 0) {
        throw new ArithmeticException("Cannot divide by zero.");
    }
    return dividend / divisor;
}

	
}
