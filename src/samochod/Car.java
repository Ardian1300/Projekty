package samochod;

public class Car {

    private String brand;
    private String model;
    private int year;
    private int mileage;


    public Car(String brand,String model,int year, int mileage){
        this.brand = brand;
        this.model = model;
        if(year > 1886) {
            this.year = year;
        }else {
            throw new IllegalArgumentException("Year cannot be smaller than 1886");
        }
        if(mileage >= 0){
            this.mileage = mileage;
        }else{
            throw new IllegalArgumentException("Mileage cannot be nagative");
        }
    }

    public void drive(int km){
        if(km <= 0) {
            throw new IllegalArgumentException("drive cannot be nagative");
        }
        mileage += km;
    }

    public String getCarInfo(){
        return String.format("Brand: %s, Model: %s, Year: %d, Mileage: %d",brand,model,year,mileage);
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        if(year > 1886) {
            this.year = year;
        }else {
            throw new IllegalArgumentException("Year cannot be smaller than 1886");
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(int mileage) {
        if(mileage >= 0){
            this.mileage = mileage;
        }else{
            throw new IllegalArgumentException("Mileage cannot be nagative");
        }
    }
}
