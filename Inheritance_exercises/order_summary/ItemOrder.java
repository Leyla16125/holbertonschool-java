public class ItemOrder {
    private products.Product product;
    private int quantity;

    public ItemOrder(products.Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public products.Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
