package assignment4;     
 //part2_of_program5_in_hashmap

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Book> booksMap = new HashMap<>();

       
 // Creating 5 book objects
        Book book1 = new Book("Book1", 50.0, "Author1", "ISBN1", "Publication1");
        Book book2 = new Book("Book2", 60.0, "Author2", "ISBN2", "Publication2");
        Book book3 = new Book("Book3", 70.0, "Author3", "ISBN3", "Publication1");
        Book book4 = new Book("Book4", 80.0, "Author4", "ISBN4", "Publication2");
        Book book5 = new Book("Book5", 90.0, "Author5", "ISBN5", "Publication1");

 // Adding books to the map with book id as key
        booksMap.put(1, book1);
        booksMap.put(2, book2);
        booksMap.put(3, book3);
        booksMap.put(4, book4);
        booksMap.put(5, book5);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all books");
            System.out.println("2. Display book by ID");
            System.out.println("3. Reduce price for a particular publication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllBooks(booksMap);
                    break;
                case 2:
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    displayBookById(booksMap, bookId);
                    break;
                case 3:
                    System.out.print("Enter publication name to reduce price: ");
                    scanner.nextLine(); // consume newline
                    String publication = scanner.nextLine();
                    reducePriceForPublication(booksMap, publication);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);
    }

    private static void displayAllBooks(Map<Integer, Book> booksMap) {
        System.out.println("All Books:");
        for (Map.Entry<Integer, Book> entry : booksMap.entrySet()) {
            System.out.println("Book ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }

    private static void displayBookById(Map<Integer, Book> booksMap, int bookId) {
        Book book = booksMap.get(bookId);
        if (book != null) {
            System.out.println("Book with ID " + bookId + ": " + book);
        } else {
            System.out.println("Book with ID " + bookId + " not found.");
        }
    }

    private static void reducePriceForPublication(Map<Integer, Book> booksMap, String publication) {
        for (Book book : booksMap.values()) {
            if (book.getPublication().equalsIgnoreCase(publication)) {
                double reducedPrice = book.getPrice() * 0.9; // Reduce price by 10%
                book.setPrice(reducedPrice);
            }
        }
        System.out.println("Prices reduced by 10% for books from publication " + publication);
        displayAllBooks(booksMap);
    }
}
