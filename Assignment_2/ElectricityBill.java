package assignment2;

// Create a class Electricity bill with data members as customer number, customer name, units consumed and methods as follows

import java.util.Scanner;

public class ElectricityBill {
    private int customerNumber;
    private String customerName;
    private int unitsConsumed;

    // Method to read customer data
    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer number: ");
        customerNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter customer name: ");
        customerName = scanner.nextLine();
        System.out.print("Enter units consumed: ");
        unitsConsumed = scanner.nextInt();
    }

    // Method to display customer data
    public void showData() {
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
    }

    // Method to compute and return electricity bill
    public double computeBill() {
        double bill = 0;
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 1.20;
        } else if (unitsConsumed <= 300) {
            bill = 100 * 1.20 + (unitsConsumed - 100) * 2.00;
        } else if (unitsConsumed <= 600) {
            bill = 100 * 1.20 + 200 * 2.00 + (unitsConsumed - 300) * 3.00;
        } else {
            bill = 100 * 1.20 + 200 * 2.00 + 300 * 3.00 + (unitsConsumed - 600) * 5.00;
        }
        return bill;
    }

    public static void main(String[] args) {
        ElectricityBill customer = new ElectricityBill();
        customer.readData();
        System.out.println("\nCustomer Details:");
        customer.showData();
        double billAmount = customer.computeBill();
        System.out.println("Electricity Bill: Rs. " + billAmount);
    }
}
