package Race;

import Race.Rallies.GrandPrix;
import Race.Vehicles.Car;
import Race.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        GrandPrix grandPrix=new GrandPrix();
        Vehicle vehicle1=new Car("Renault Clio",80,1000,100,"Binek araç",grandPrix);
        Vehicle vehicle2=new Car("Ferrari",300,1000,100,"Yarış arabası",grandPrix);

        grandPrix.append(vehicle1);
        grandPrix.append(vehicle2);

        System.out.println("Eligible to race ? "+grandPrix.check());

        System.out.println("Part 1 -----------------------------");
        System.out.println(vehicle1);
        System.out.println(vehicle2);

        System.out.println("Yarışı kazanan araç ve bilgileri ---"
        +grandPrix.getWinner().getMaxSpeed()+" km hız ile "+
                grandPrix.getWinner().getVehicleName()+
                " aracı 1. oldu");




    }
}
