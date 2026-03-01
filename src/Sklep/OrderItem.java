package Sklep;

public class OrderItem{

    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity ){
        if(quantity > 0){
            this.quantity = quantity;
            this.product = product;
        }else{
            throw new IllegalArgumentException("Nieprawidłowa ilość");
        }
    }

    public double getTotalPrice(){
        return product.getPrice() * quantity;
    }

    public String getDescription(){
        return String.format("%d x %s = %.1f",quantity,product.getName(), product.getPrice());
    }
}
