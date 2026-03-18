package systemPojazdow;


public class Car extends Vehicle implements Refuelable {

    protected int mileage;
    protected FuelType fuelType;
    protected  int fuelLevel;

    public Car(String brand,String model, int year,int mileage,FuelType fuelType, int fuelLevel){
        super(brand,model,year);
        this.fuelType = fuelType;
        if (fuelLevel > 100 || fuelLevel < 0){
            throw new InvalidFuelException("Fuel level is incorrect");
        }else {
            this.fuelLevel = fuelLevel;
        }
        if (mileage < 0){
            throw new IllegalArgumentException("Mileage is incorrect");
        }else {
            this.mileage = mileage;
        }
    }

    @Override
    public String getInfo(){
        return String.format("Brand: %s, Model: %s, Year: %d, Mileage: %d",brand,model,year,mileage);
    }
    @Override
    public void start() {
        System.out.println("Odpalam kluczyk w samochodzie i wciskam pedał gazu");
    }

    @Override
    public void stop() {
        System.out.println("Wciskam pedał hamulca i zatrzymuje się");
    }

    @Override
    public void refuel(int amount) {
        if(this.fuelType == FuelType.ELECTRIC) throw new InvalidFuelException("Nie można tankować");
        if(amount> 100 || amount < 0) throw new InvalidFuelException("Nie odpowiednia ilość paliwa");
        if ((fuelLevel+amount) > 100) throw new InvalidFuelException("Nie można zatankować tak dużo paliwa");
        fuelLevel += amount;

    }
}
