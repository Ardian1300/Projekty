package samochod;

public class Main {

    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes","S-Class",2024,150);
        mercedes.drive(250);
        System.out.println(mercedes.getCarInfo());
        mercedes.setModel("Benz");
        System.out.println(mercedes.getModel());
    }
}
