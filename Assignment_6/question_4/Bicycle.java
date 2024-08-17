package q4;
public class Bicycle extends Vehicle {
    public int gearCount;
 

    public Bicycle(String vehicleNumber, int gearCount) {
        super(vehicleNumber);
        this.gearCount = gearCount;
    }

    @Override
    public String toString() {
        return "Bicycle [Gear Count: " + gearCount + ", " + super.toString() + "]";
    }
}