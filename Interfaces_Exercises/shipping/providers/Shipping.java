package providers;

public class Shipping {
    private final double value;
    private final ShippingProviderType shippingProviderType;

    public Shipping(double value, ShippingProviderType shippingProviderType) {
        this.value = value;
        this.shippingProviderType = shippingProviderType;
    }

    public double getValue() {
        return value;
    }

    public ShippingProviderType getShippingProviderType() {
        return shippingProviderType;
    }
}
