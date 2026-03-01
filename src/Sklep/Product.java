package Sklep;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price){
        if(price >= 0){
            this.name = name;
            this.price = price;
        }else{
            throw new IllegalArgumentException("Nieprawidlowa cena");
        }
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
