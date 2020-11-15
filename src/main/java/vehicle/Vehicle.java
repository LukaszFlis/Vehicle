package vehicle;

/**
 *  Supper class
 *  Define new vehicle objects
 */
public class Vehicle {
    private int topSpeed;
    private String producer;
    public String vehicleType;

    /**
     * Constructor method.
     * Create new object with producer name and top speed value.
     * @param producer define the name of the producer
     * @param topSpeed define the max speed in km/h
     */
    public Vehicle(String producer, int topSpeed) {
        this.producer = producer;
        this.topSpeed = topSpeed;
    }

    /**
     * Getter
     * @return topSpeed
     */
    public int getTopSpeed() {
        return topSpeed;
    }

    /**
     * Set field topSpeed
     * @param topSpeed  The max speed of vehicle
     */
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    /**
     * Getter
     * @return producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     *Set field producer
     * @param producer The producer iof
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * Getter
     * @return vehicle type
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Set vehicle type
     * @param vehicleType name of vehicle type (CAR,PLANE,SHIP,BIKE)
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * Override method toString()
     * @return string with name of producer and value of topSpeed
     */
    public String toString(){
        return "[Producent]:" + getProducer() + ", [Maksymalna predkosc]:" + getTopSpeed();
    }
}