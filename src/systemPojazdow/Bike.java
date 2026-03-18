package systemPojazdow;

public class Bike extends Vehicle{

    public Bike(String brand,String model, int year){
        super(brand,model,year);
    }

    @Override
    public String getInfo(){
        return String.format("Brand: %s, Model: %s, Year: %d",brand,model,year);
    }

    @Override
    public void start() {
        System.out.println("Zaczynam kręcić pedałami i ruszam z miejsca");
    }

    @Override
    public void stop() {
        System.out.println("Wciskam hamulca przy kierownicy i zatrzymuje rower");
    }
}
