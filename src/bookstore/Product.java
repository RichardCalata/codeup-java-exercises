package bookstore;

public class Product {

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    String title;
    double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }
}
