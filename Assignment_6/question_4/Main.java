package q4;
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("C123", "Toyota Corolla");
        Vehicle motorcycle = new Motorcycle("M456", "Sport");
        Vehicle bicycle = new Bicycle("B789", 21);
        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(bicycle);
        System.out.println("\nRenting vehicles...");
        if (car.rent()) {
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car is not available.");
        }
        if (motorcycle.rent()) {
            System.out.println("Motorcycle rented successfully.");
        } else {
            System.out.println("Motorcycle is not available.");
        }
       

        if (bicycle.rent()) {
            System.out.println("Bicycle rented successfully.");
        } else {
            System.out.println("Bicycle is not available.");
        }
        System.out.println("\nAfter renting:");
        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(bicycle);

  
        System.out.println("\nReturning vehicles...");
    
        if (car.returnVehicle()) {
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Car was not rented.");
        }
    
        if (motorcycle.returnVehicle()) {
            System.out.println("Motorcycle returned successfully.");
        } else {
            System.out.println("Motorcycle was not rented.");
        }
     

        if (bicycle.returnVehicle()) {
            System.out.println("Bicycle returned successfully.");
        } else {
            System.out.println("Bicycle was not rented.");
        }

    
        System.out.println("\nAfter returning:");
        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(bicycle);
    }
}
