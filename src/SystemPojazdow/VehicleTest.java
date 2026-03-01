package SystemPojazdow;

import java.util.ArrayList;

public class VehicleTest {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles= new ArrayList<>();

        vehicles.add(new Car()) ;
        vehicles.add(new Bike()) ;

        for(Vehicle v : vehicles){
            v.start();
            v.stop();
        }


    }
}
