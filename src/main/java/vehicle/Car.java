package vehicle;

/**
 * Subclass of Vehicle
 * Define new Car objects
 */
public class Car extends Vehicle{
    /**
     * Constructor method.
     * Create new object with producer name and top speed value.
     * Set vehicle type to CAR
     * @param producer define the name of the producer
     * @param topSpeed define the max speed in km/h
     */
    public Car(String producer, int topSpeed) {
        super(producer, topSpeed);
        this.vehicleType = "CAR";
    }
}
