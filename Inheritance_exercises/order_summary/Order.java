import java.text.DecimalFormat;

public class Order {
    private double discountPercent;
    private ItemOrder[] items;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Order(double discountPercent, ItemOrder[] items) {
        this.discountPercent = discountPercent;
        this.items = items;
    }

    public void presentOrderSummary() {
        System.out.println("------- ORDER SUMMARY -------");

        double totalProducts = 0.0;

        for (ItemOrder item : items) {
            String type = item.getProduct().getClass().getSimpleName(); // Book / Dvd
            String title = item.getProduct().getTitle();
            double price = item.getProduct().getPrice();
            int quantity = item.getQuantity();
            double total = price * quantity;

            totalProducts += total;

            System.out.println(
                    "Type: " + type +
                    "  Title: " + title +
                    "  Price: " + format(price) +
                    "  Quant: " + quantity +
                    "  Total: " + format(total));
        }

        System.out.println("----------------------------");

        double discount = totalProducts * (discountPercent / 100.0);
        double totalOrder = totalProducts - discount;

        System.out.println("DISCOUNT: " + format(discount));
        System.out.println("TOTAL PRODUCTS: " + format(totalProducts));
        System.out.println("----------------------------");
        System.out.println("TOTAL ORDER: " + format(totalOrder));
        System.out.println("----------------------------");
    }

    private String format(double value) {
        return df.format(value).replace('.', ',');
    }
}
