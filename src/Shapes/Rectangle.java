package Shapes;

public class Rectangle extends Shape {
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getSquare(){
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return String.format("%s имеет площадь %.2f", this.name, getSquare());
    }
}
