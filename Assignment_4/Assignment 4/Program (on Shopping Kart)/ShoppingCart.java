package assignment4;      

//part2_of_program6

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private ArrayList<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addItem(Item item) {
        cart.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    public void removeItem(Item item) {
        if (cart.remove(item)) {
            System.out.println(item.getName() + " removed from cart.");
        } else {
            System.out.println("Item not found in cart.");
        }
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Items in your shopping cart:");
            for (Item item : cart) {
                System.out.println(item);
            }
        }
    }

    public void viewShop(ArrayList<Item> shop) {
        System.out.println("Items available in the shop:");
        for (Item item : shop) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<Item> shop = new ArrayList<>();
        shop.add(new Item("Laptop", 1000));
        shop.add(new Item("Smartphone", 500));
        shop.add(new Item("Headphones", 100));
        shop.add(new Item("Keyboard", 50));

        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View cart");
            System.out.println("4. View shop");
            System.out.println("5. End shopping and proceed to checkout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cart.viewShop(shop);
                    System.out.print("Enter item number to add to cart: ");
                    int addItemIndex = scanner.nextInt();
                    if (addItemIndex >= 1 && addItemIndex <= shop.size()) {
                        cart.addItem(shop.get(addItemIndex - 1));
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;
                case 2:
                    cart.viewCart();
                    if (!cart.cart.isEmpty()) {
                        System.out.print("Enter item number to remove from cart: ");
                        int removeItemIndex = scanner.nextInt();
                        if (removeItemIndex >= 1 && removeItemIndex <= cart.cart.size()) {
                            cart.removeItem(cart.cart.get(removeItemIndex - 1));
                        } else {
                            System.out.println("Invalid item number.");
                        }
                    }
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                    cart.viewShop(shop);
                    break;
                case 5:
                    System.out.println("Proceeding to checkout...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

// Calculate total price

        double totalPrice = 0;
        for (Item item : cart.cart) {
            totalPrice += item.getPrice();
        }
        System.out.println("Total Price: $" + totalPrice);

        scanner.close();
    }
}
