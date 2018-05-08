package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side,side);

    }

    public double getArea(){
        return this.length*this.length;
    }

    public double getPerimeter(){
        return 4*this.length;
    }


}
