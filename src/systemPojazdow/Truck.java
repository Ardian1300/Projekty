package systemPojazdow;

public class Truck extends Car {

    protected int maxLoad;

    public Truck(String brand, String model, int year, int mileage,int maxLoad,FuelType fuelType, int fuelLevel){
        super(brand,model,year,mileage,fuelType,fuelLevel);
        if (maxLoad < 0){
            throw new IllegalArgumentException("Max load is incorrect");
        }else {
            this.maxLoad = maxLoad;
        }
    }

    @Override
    public String getInfo(){
        return String.format("Brand: %s, Model: %s, Year: %d, Mileage: %d, Maxload: %d",brand,model,year,mileage,maxLoad);
    }
    @Override
    public void start() {
        System.out.println("Odpalam kluczyk w samochodzie i wciskam pedał gazu i powoli się rozpędzam ");
    }

    @Override
    public void stop() {
        System.out.println("Wciskam pedał hamulca i zatrzymuje Ciężaówkę");
    }
}
