package Race.Vehicles;

import Race.Rallies.Rally;

public class Car extends Vehicle{
    private String category;


    public Car(String vehicleName, double maxSpeed, int weight, int fuel, String category, Rally rally) {
        super(vehicleName, maxSpeed, weight, fuel,rally);
        this.category = category;
    }

    @Override
    public boolean isTwoWheels() {
        return false;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return super.toString()+
                " category= " + category;
    }
}
