package shapes;

public class Square extends Quadrilateral implements Measurable{
    private double side;

    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setLength(double length){
        this.side =length;
    }

    public double getSide() {

        return side;
    }
}
