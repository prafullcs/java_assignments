class Vehicle {
	
	int vehicleNumber;
	boolean isAvailable;
	
	public Vehicle(int vehicleNumber, boolean isAvailable) {
		this.vehicleNumber = vehicleNumber;
		this.isAvailable = isAvailable;
	}
	
	public void rent(double rent, double time) {
		System.out.println("Rent of vehicle is " + rent * time);
	}
	
	public void returnVehicle() {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Availabilty Status: " + isAvailable);
	}
	
}

class Car extends Vehicle {
	String brand;

	public Car(int vehicleNumber, boolean isAvailable, String brand) {
		super(vehicleNumber, isAvailable);
		this.brand = brand;
	}
	
	public void rent(double rent, double time) {
		System.out.println("Rent of Car is " + rent * time);
	}
	
	public void returnVehicle() {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Availabilty Status: " + isAvailable);
		System.out.println("Car Brand: " + brand);
	}
}

class MotorCycle extends Vehicle {
	String brand;

	public MotorCycle(int vehicleNumber, boolean isAvailable, String brand) {
		super(vehicleNumber, isAvailable);
		this.brand = brand;
	}
	
	public void rent(double rent, double time) {
		System.out.println("Rent of Motor Cycle is " + rent * time);
	}
	
	public void returnVehicle() {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Availabilty Status: " + isAvailable);
		System.out.println("Motorcycle Brand: " + brand);
	}
}

class Bicycle extends Vehicle {
	String brand;
	
	public Bicycle(int vehicleNumber, boolean isAvailable, String brand) {
		super(vehicleNumber, isAvailable);
		this.brand = brand;
	}
	
	public void rent(double rent, double time) {
		System.out.println("Rent of Bicycle is " + rent * time);
	}
	
	public void returnVehicle() {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Availabilty Status: " + isAvailable);
		System.out.println("Car Brand: " + brand);
	}
}
public class PS4 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(4342356, true);
		v.returnVehicle();
		v.rent(7000, 8);
		Car c = new Car(2361242, false, "Volvo");
		c.returnVehicle();
		c.rent(12000, 12);
		MotorCycle mc = new MotorCycle(4895648, true, "Apache");
		mc.returnVehicle();
		mc.rent(6000, 5);
		Bicycle bc = new Bicycle(9361435, false, "Hero");
		bc.returnVehicle();
		bc.rent(2000, 4);
	}
}
