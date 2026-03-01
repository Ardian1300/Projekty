package Sklep;

import java.util.ArrayList;

public class Order {

    private ArrayList<OrderItem> items ;

    public Order(){
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public double getOrderTotal(){
        double total = 0;
        for(OrderItem item : items){
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printOrder(){
        for(OrderItem item : items){
            System.out.println(item.getDescription());
        }
        System.out.println("Razem: " + getOrderTotal());
    }

    public double getOrderTotalWithDiscount(Discountable discount){
        return discount.applyDiscount(getOrderTotal());
    }
}
