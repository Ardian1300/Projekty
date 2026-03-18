package systemPojazdow;

public abstract class Vehicle {

    protected String brand;
    protected int year;
    protected String model;



    public Vehicle(String brand,String model, int year) {
        this.brand = brand;
        this.model = model;
        if(year < 1886){
            throw new IllegalArgumentException("Year is to low");
        }else{
            this.year = year;
        }

    }

    public abstract void start();
    public abstract void stop();

    public  String getInfo(){
        return String.format("Brand: %s, Model: %s, Year: %d",brand,model,year);
    }

}
