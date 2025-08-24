import products.Product;

public class ItemOrder {
    private Product product;
    private int quantity;

    public ItemOrder(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
