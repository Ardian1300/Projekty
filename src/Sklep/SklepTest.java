package Sklep;

public class SklepTest {
    public static void main(String[] args) {

        Product milk = new Product("Mleko", 5.0);
        Product bread = new Product("Chleb", 3.5);
        Product eggs = new Product("Jajak", 4.0);
        Product ham = new Product("Szynka", 7.8);
        Product chicken = new Product("Kurczak", 12.3);

        OrderItem item1 = new OrderItem(milk,3);
        OrderItem item2 = new OrderItem(bread,1);
        OrderItem item3 = new OrderItem(eggs,2);
        OrderItem item4 = new OrderItem(ham,1);
        OrderItem item5 = new OrderItem(chicken,1);

        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);
        order.addItem(item4);
        order.addItem(item5);

        order.printOrder();

        Discountable seasonal = new SeasonalDiscount();
        Discountable loyalCustomer = new LoyalCustomerDiscount();

        System.out.println("Razem po zniżce sezonowej: " + order.getOrderTotalWithDiscount(seasonal));
    }
}
