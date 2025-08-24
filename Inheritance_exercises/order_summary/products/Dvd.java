package products;

public class Dvd extends Products {
    private String director;
    private String genre;
    private int duration;

    public Dvd(String title, int year, String country, double price, String director, String genre, int duration) {
        super(title, year, country, price);
        this.director = director;
        this.genre = genre;
        this.duration = duration;
    }

    public String getDirector() { return director; }
}
