package Race.Vehicles;

import Race.Rallies.Rally;

public class Moto extends Vehicle {
    private boolean hasSideCar;
    private String category;

    public Moto(String vehicleName, double maxSpeed, int weight, int fuel,String category) {
        super(vehicleName, maxSpeed, weight, fuel);
        this.category=category;
    }

    public Moto(String vehicleName, double maxSpeed, int weight, int fuel, boolean hasSideCar) {
        super(vehicleName, maxSpeed, weight, fuel);
        this.hasSideCar = hasSideCar;
    }
    public Moto(String vehicleName, double maxSpeed, int weight, int fuel, boolean hasSideCar, Rally rally,String category) {
        super(vehicleName, maxSpeed, weight, fuel,rally);
        this.hasSideCar = hasSideCar;
        this.category=category;
    }

    @Override
    public boolean isTwoWheels() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+
                " hasSideCar = " + hasSideCar +
                " category = " + category;
    }
}
