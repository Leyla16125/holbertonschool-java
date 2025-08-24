import products.Product;

public class Order {
    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (ItemOrder item : items) {
            Product p = item.getProduct();
            total += p.getNetPrice() * item.getQuantity();
        }
        return total * (1 - discountPercentage / 100.0);
    }
}
