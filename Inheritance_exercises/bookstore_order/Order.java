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
            total += item.getQuantity() * item.getProduct().getNetPrice();
        }
        if (discountPercentage > 0) {
            total -= total * (discountPercentage / 100.0);
        }
        return total;
    }

    public void presentOrderSummary() {
        System.out.println("Order Summary:");
        for (ItemOrder item : items) {
            Product product = item.getProduct();
            System.out.printf("- %s | Qty: %d | Net Price: %.2f | Subtotal: %.2f%n",
                    product.getTitle(),
                    item.getQuantity(),
                    product.getNetPrice(),
                    item.getQuantity() * product.getNetPrice());
        }
        System.out.printf("Discount: %.2f%%%n", discountPercentage);
        System.out.printf("Total: %.2f%n", calculateTotal());
    }
}
