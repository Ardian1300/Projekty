package systemPojazdow;

import java.util.ArrayList;

public class VehicleTest {
    public static void main(String[] args) {

       ArrayList<Vehicle> vehicles= new ArrayList<>();

        vehicles.add(new Bike("BMX","352",2023)) ;
        vehicles.add(new Car("Audi","R8",2020,100000,FuelType.DIESEL,90)) ;
        vehicles.add(new Truck("Scania","Max",2023,50000,150,FuelType.PETROL,83)) ;

        for(Vehicle v : vehicles) {
            System.out.println(v.getInfo());
            v.start();
            v.stop();
            if (v instanceof Car r) {
                try {
                    if(r.fuelLevel < 50){
                    r.refuel(10);}
                } catch (InvalidFuelException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(r.fuelLevel);
            }

        }

        /*
        Vehicle v1 = new Bike("BMX","352",2023);
        Vehicle v2 = new Car("Audi","R8",2020,100000);
        Vehicle v3 = new Truck("Scania","Max",2023,50000,150);

        System.out.println(v1.getInfo());
        System.out.println(v2.getInfo());
        System.out.println(v3.getInfo());
        */
    }
}
