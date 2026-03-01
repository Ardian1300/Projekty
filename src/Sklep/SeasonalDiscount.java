package Sklep;

public class SeasonalDiscount implements Discountable{
    @Override
    public double applyDiscount(double total) {
        return total * 0.9; // 10% rabatu
    }
}
