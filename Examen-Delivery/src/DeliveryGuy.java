public class DeliveryGuy {

    private String name;
    private Vehicle vehicle;
    private boolean Availability;

    public DeliveryGuy(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        this.Availability = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean availability) {
        Availability = availability;
    }
}

enum Vehicle {
    BICICLE, WALKING, MOTORBIKE
}