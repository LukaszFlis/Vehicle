package vehicle;

public class Bike extends Vehicle{
    public Bike(String producer, int topSpeed) {
        super(producer, topSpeed);
        this.vehicleType = "BIKE";
    }
}
