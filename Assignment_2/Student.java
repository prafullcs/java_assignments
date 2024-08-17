package assignment2;

import java.util.Scanner;

//Write a Java program to create Student class with member variable as id, name, mark and result.
// Use method to initialize the value of name, id and marks.
//  Write a member function to find the result and display the student details with result.

public class Student {
    int id;
    String name;
    double mark;
    String result;
    
    // Method to initialize values of id, name, and mark
    public void initialize(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    // Method to find the result based on the mark
    public void findResult() {
        if (mark >= 40) {
            result = "Pass";
        } else {
            result = "Fail";
        }
    }

    // Method to display student details with result
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Mark: " + mark);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student mark:");
        double mark = scanner.nextDouble();

        Student student = new Student();
        student.initialize(id, name, mark);
        student.findResult();
        student.displayDetails();
    }
}

