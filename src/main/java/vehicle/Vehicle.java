package vehicle;

public class Vehicle {
    private int topSpeed;
    private String producer;
    public String vehicleType;

    public Vehicle(String producer, int topSpeed) {
        this.producer = producer;
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String toString(){
        return "[Producent]:" + getProducer() + ", [Maksymalna predkosc]:" + getTopSpeed();
    }
}
