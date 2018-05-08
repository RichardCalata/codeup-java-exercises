package company;

public class Subscription extends Product {

protected int numberOfMonths;
protected double revenuePerPeriod;
protected String type;

    public double getRevenuePerPeriod() {
        return revenuePerPeriod;
    }

    public Subscription(String name, double price, double cost){

        this.numberOfMonths = numberOfMonths;
        getRevenuePerPeriod();
        type = "subsrcription";
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }
}
