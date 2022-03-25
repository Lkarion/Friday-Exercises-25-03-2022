package Shapes;

public class Quadrat extends Shape{
    int side;
    static final String objectName = "Quadrat";

    public Quadrat(int side) {
        this.side = side;
    }

    public double getSquare(){
        return this.side*this.side;
    }

    public String toString() {
        return String.format("%s имеет площадь %.2f", this.objectName, getSquare());
    }
}
