package Race.Rallies;

import Race.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GrandPrix implements Rally{

    private List<Vehicle> vehicles=new ArrayList<Vehicle>();

    public GrandPrix() {
        System.out.println("Pist oluşturuldu");
    }

    @Override
    public boolean check() {
        for(Vehicle arac:vehicles){
            if(!arac.isTwoWheels()&&arac.getFuel()==100)
                return true;
        }
        return false;
    }
    public void append(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void run(int tours){
        tours++;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public Vehicle getWinner(){
        double max=0;
        for(Vehicle arac:vehicles){
            if(arac.getMaxSpeed()>max){
                max= arac.getMaxSpeed();
            }
        }
        return vehicles.get(1);
    }
//    public double getWinnerSpeed(List<Vehicle> vehicles){
//        ;
//        for(Vehicle data:vehicles){
//            if(data.getMaxSpeed()<max.getMaxSpeed()){
//                max=data.;
//            }
//        }
//        double max=vehicles.get(0);
//        for(Vehicle arac:vehicles){
//
//            if(!(max>arac.getMaxSpeed())){
//                if(max< arac.getMaxSpeed())
//                    max= arac.getMaxSpeed();
//            }
//            return max;
//        }
//        return 0;
//    }

    @Override
    public String toString() {
        return "GrandPrix{" +
                "vehicles=" + vehicles +
                '}';
    }
}
