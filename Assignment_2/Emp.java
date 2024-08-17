package assignment2;
// Create a class called Emp with data members empno, empname, designation, 
// dept and salary and methods as readEmpData() (to read  values to data members) and displayEmpData()
// (to display data members values to the screen) create an employee instance and display its information.

import java.util.Scanner;

public class Emp {
    int empno;
    String empname, designation, dept;
    double salary;

    // mehod to read employee  data
    public void readEmpData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Number:");
        empno = sc.nextInt();
        System.out.println("Enter Employee Name:");
        empname = sc.next();
        System.out.println("Enter Designation:");
        designation = sc.next();
        System.out.println("Enter Department:");
        dept = sc.next();
        System.out.println("Enter Salary:");
        salary = sc.nextDouble();
    }

    public void displayEmpData() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + empname);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Emp employee = new Emp();
        employee.readEmpData();
        employee.displayEmpData();
    }
}
