package vehicle;
/**
 * Subclass of Vehicle
 * Define new Ship objects
 */
public class Ship extends Vehicle{
    /**
     * Constructor method.
     * Create new object with producer name and top speed value.
     * Set vehicle type to SHIP
     * @param producer define the name of the producer
     * @param topSpeed define the max speed in km/h
     */
    public Ship(String producer, int topSpeed) {
        super(producer, topSpeed);
        this.vehicleType = "SHIP";
    }
}
