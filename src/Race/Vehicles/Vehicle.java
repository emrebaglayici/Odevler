package Race.Vehicles;


import Race.Rallies.GrandPrix;
import Race.Rallies.Rally;

public class Vehicle {
    private String vehicleName;
    private double maxSpeed;
    private int weight;
    private int fuel;
    private Rally rally;

    public Vehicle(Rally rally) {
        this.rally = rally;
    }

    public Vehicle() {
    }

    public Vehicle(String vehicleName, double maxSpeed, int weight, int fuel) {
        this.vehicleName = vehicleName;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.fuel = fuel;
    }

    public Vehicle(String vehicleName, double maxSpeed, int weight, int fuel, Rally rally) {
        this.vehicleName = vehicleName;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.fuel = fuel;
        this.rally = rally;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    public boolean isTwoWheels(){
        return true;
    }

    public boolean bestSpeed(){
//        System.out.println(grandPrix.getVehicles());
//        for (int i = 0; i < grandPrix.getVehicles().size(); i++) {
//            double max=maxSpeed;
//            if(max>grandPrix.getVehicles().get(1).getMaxSpeed())
//                return true;
//        }

        return false;
    }

//    public Vehicle getWinerInfo(){
//        System.out.println(grandPrix.getVehicles().size());
//        for (Vehicle arac:grandPrix.getVehicles()) {
//                double max=maxSpeed;
//                if(arac.getMaxSpeed()>maxSpeed)
//                    return arac;
//        }
//        return null;
//    }

    @Override
    public String toString() {
        return
                "vehicleName=" + vehicleName +
                ", maxSpeed=" + maxSpeed +" km/h"+
                ", weight=" + weight +" kg";
    }
}
