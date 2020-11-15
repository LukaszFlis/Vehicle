package vehicle;
/**
 * Subclass of Vehicle
 * Define new Bike objects
 */
public class Bike extends Vehicle{
    /**
     * Constructor method.
     * Create new object with producer name and top speed value.
     * Set vehicle type to BIKE
     * @param producer define the name of the producer
     * @param topSpeed define the max speed in km/h
     */
    public Bike(String producer, int topSpeed) {
        super(producer, topSpeed);
        this.vehicleType = "BIKE";
    }
}
