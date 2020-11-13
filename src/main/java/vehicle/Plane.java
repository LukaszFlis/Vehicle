package vehicle;

public class Plane extends Vehicle {
    public Plane(String producer, int topSpeed) {
        super(producer, topSpeed);
        this.vehicleType = "PLANE";
    }
}
