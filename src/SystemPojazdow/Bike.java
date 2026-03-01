package SystemPojazdow;

public class Bike extends Vehicle{

    @Override
    public void start() {
        System.out.println("Zaczynam kręcić pedałąmi i ruszam z miejsca");
    }

    @Override
    public void stop() {
        System.out.println("Wciskam hamulca przy kierownicy i zatrzymuje rower");
    }
}
