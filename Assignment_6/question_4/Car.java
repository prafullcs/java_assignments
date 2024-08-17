package q4;
public class Car extends Vehicle {
    public String model;

    public Car(String vehicleNumber, String model) {
        super(vehicleNumber);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car [Model: " + model + ", " + super.toString() + "]";
    }
}
