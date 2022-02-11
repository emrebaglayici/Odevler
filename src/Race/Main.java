package Race;

import Race.Rallies.GrandPrix;
import Race.Vehicles.Car;
import Race.Vehicles.Moto;
import Race.Vehicles.Vehicle;

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

        GrandPrix grandPrix1=new GrandPrix();
        Vehicle vehicle3=new Moto("Honda",200
                ,250,100,false,grandPrix1,"Moto");
        Vehicle vehicle4=new Moto("Kasavaki",500
                ,300,100,true,grandPrix1,"Moto");

        grandPrix1.append(vehicle3);
        grandPrix1.append(vehicle4);
        System.out.println("Part 2 -----------------------------");
        System.out.println("Motors");
        System.out.println(vehicle3);
        System.out.println(vehicle4);


        GrandPrix grandPrix2=new GrandPrix();

        System.out.println("Part 3 ------------------------------");
        System.out.println("Cars");
        Vehicle vehicle5=new Car("Tofaş",15,2000,100,"Binek araç",grandPrix2);
        Vehicle vehicle6=new Car("Maserati",450,1000,100,"Yarış Arabası",grandPrix2);
        System.out.println(vehicle5);
        System.out.println(vehicle6);



    }
}
