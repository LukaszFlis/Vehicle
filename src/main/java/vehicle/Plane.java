package vehicle;
/**
 * Subclass of Vehicle
 * Define new Plane objects
 */
public class Plane extends Vehicle {
    /**
     * Constructor method.
     * Create new object with producer name and top speed value.
     * Set vehicle type to SHIP
     * @param producer define the name of the producer
     * @param topSpeed define the max speed in km/h
     */
    public Plane(String producer, int topSpeed) {
        super(producer, topSpeed);
        this.vehicleType = "PLANE";
    }
}
