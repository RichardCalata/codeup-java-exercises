package shapes;

public class Square extends Quadrilateral implements Measurable{
    private double side;
    public Square(double length, double width) {
        super(length, length);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {

        return side;
    }
}
