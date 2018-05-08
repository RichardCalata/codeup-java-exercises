import company.Product;

public class Car extends Product {
    protected String make;
    protected String model;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(double price, String name, double cost, String make, String model) {
        super(price, name, cost);
        this.make = make;
        this.model = model;
    }
}
