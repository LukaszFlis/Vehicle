package vehicle;

public class Ship extends Vehicle{
    public Ship(String producer, int topSpeed) {
        super(producer, topSpeed);
        this.vehicleType = "SHIP";
    }
}
