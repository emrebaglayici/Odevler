package Race.Vehicles;

public class Moto extends Vehicle {
    private boolean hasSideCar;

    public Moto(String vehicleName, double maxSpeed, int weight, int fuel) {
        super(vehicleName, maxSpeed, weight, fuel);
    }

    public Moto(String vehicleName, double maxSpeed, int weight, int fuel, boolean hasSideCar) {
        super(vehicleName, maxSpeed, weight, fuel);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public boolean isTwoWheels() {
        return true;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "hasSideCar=" + hasSideCar +
                '}';
    }
}
