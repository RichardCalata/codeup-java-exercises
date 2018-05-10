package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
//this is supposed to be an abstract class!!

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

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
