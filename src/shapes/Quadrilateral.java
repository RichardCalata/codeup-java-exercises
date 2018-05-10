package shapes;

public class Quadrilateral extends Shape implements Measurable {


    protected double length;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    protected double width;

    @Override
    public double getPerimeter() {
        return 2*this.length+2*this.width;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
