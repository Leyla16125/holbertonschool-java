import providers.Shipping;

public class Order {
    private final int code;
    private final double weight; // grams
    private final double total;
    private Shipping shipping;

    public Order(int code, double weight, double total) {
        this.code = code;
        this.weight = weight;
        this.total = total;
    }

    public int getCode() {
        return code;
    }

    public double getWeight() {
        return weight;
    }

    public double getTotal() {
        return total;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }
}
