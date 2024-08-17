package assignment4;      
//program1_of_collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

    // Adding elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

    // a) Add element

        System.out.print("Enter an element to add: ");
        int addElement = scanner.nextInt();
        arrayList.add(addElement);
        System.out.println("Added " + addElement + " to the list.");

    // b) Remove a particular element

        System.out.print("Enter an element to remove: ");
        int removeElement = scanner.nextInt();
        if (arrayList.contains(removeElement)) {
            arrayList.remove(Integer.valueOf(removeElement)); // Removing by object to avoid removing by index
            System.out.println("Removed " + removeElement + " from the list.");
        } else {
            System.out.println(removeElement + " not found in the list.");
        }

 // c) Modify

        System.out.print("Enter index to modify: ");
        int modifyIndex = scanner.nextInt();
        if (modifyIndex >= 0 && modifyIndex < arrayList.size()) {
            System.out.print("Enter new value: ");
            int newValue = scanner.nextInt();
            arrayList.set(modifyIndex, newValue);
            System.out.println("Modified element at index " + modifyIndex + " with value " + newValue);
        } else {
            System.out.println("Invalid index.");
        }

// d) View All elements using Iterator

        System.out.println("All elements in the list:");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    // e) View a Particular element (get())

        System.out.print("Enter index to view: ");
        int viewIndex = scanner.nextInt();
        if (viewIndex >= 0 && viewIndex < arrayList.size()) {
            System.out.println("Element at index " + viewIndex + ": " + arrayList.get(viewIndex));
        } else {
            System.out.println("Invalid index.");
        }

 // f) Sort (Collections.sort()
 
        Collections.sort(arrayList);
        System.out.println("Sorted list: " + arrayList);
    }
}