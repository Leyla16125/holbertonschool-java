package products;

public class Book extends Products {
    private int pages;
    private String author;
    private int edition;

    public Book(String title, int year, String country, double price, int pages, String author, int edition) {
        super(title, year, country, price);
        this.pages = pages;
        this.author = author;
        this.edition = edition;
    }

    public String getAuthor() { return author; }
}
