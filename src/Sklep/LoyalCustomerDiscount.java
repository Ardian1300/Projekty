package Sklep;

public class LoyalCustomerDiscount implements Discountable{
    @Override
    public double applyDiscount(double total) {
        return total * 0.95; // 5% rabatu
    }
}
