package q4;
public abstract class Vehicle {
    public String vehicleNumber;
    public boolean isAvailable;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.isAvailable = true;

    }

    public boolean rent() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean returnVehicle() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNumber + ", Available: " + isAvailable;
    }
}
