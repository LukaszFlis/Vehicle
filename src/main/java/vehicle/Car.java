package vehicle;

public class Car extends Vehicle{
    public Car(String producer, int topSpeed) {
        super(producer, topSpeed);
        this.vehicleType = "CAR";
    }
}
