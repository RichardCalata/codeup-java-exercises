package company;

public class Product {
    public Product() {
    }

    protected double price;
    protected String name;
    protected double cost;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Product(double price, String name, double cost) {
        this.price = price;
        this.name = name;
        this.cost = cost;

    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
