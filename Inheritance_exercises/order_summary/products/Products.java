package products;

public abstract class Products {
    private String title;
    private int year;
    private String country;
    private double price;

    public Products(String title, int year, String country, double price) {
        this.title = title;
        this.year = year;
        this.country = country;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
