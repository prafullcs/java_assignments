package q4;

public class Motorcycle extends Vehicle {

    public String type;
    public Motorcycle(String vehicleNumber, String type) {
        super(vehicleNumber);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motorcycle [Type: " + type + ", " + super.toString() + "]";
    }
}