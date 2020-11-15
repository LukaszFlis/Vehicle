package vehicle;
/**
 * Factory class
 * Create vehicle subclass object based on type
 */
public class VehicleStaticFactory {
    /**
     * Take three parameters.
     * Based on vehicle type create new object.
     * @param type First parameter - type of vehicle.
     * @param producer Second parameter  - producer .
     * @param speed Third parameter - max speed value.
     * @return subclass new object
     */
    @org.jetbrains.annotations.Nullable
    public static Vehicle make (String type, String producer, int speed) {
        type = type.toUpperCase();
        switch (type) {
            case "CAR":
                return new Car(producer, speed);
            case "SHIP":
                return new Ship(producer, speed);
            case "PLANE":
                return new Plane(producer, speed);
            case "BIKE":
                return new Bike(producer, speed);
            default:
                return null;
        }
    }
}
