package Shapes;

public class Quadrat extends Shape{
    int side;

    public Quadrat(int side) {
        super("Quadrat");
        this.side = side;
    }

    @Override
    public double getSquare(){
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return String.format("%s имеет площадь %.2f", this.name, getSquare());
    }
}
