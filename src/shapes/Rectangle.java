package shapes;

public class Rectangle {

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    protected double width;
    protected double length;

    public double getArea(){
        return this.length * this.width;
    }

    public double getperimeter(){
        return 2*this.length + 2*this.width;
    }

}
