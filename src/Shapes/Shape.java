package Shapes;

// 1.создать классы содержащие методы для подсчета площади прямоугольника
//     * квадарата и круга. Кроме результата подсчета должно выводиться также
//     * название соответствующей фигуры. Создать массив таких обьектов и вывести
//     * его на экран
//     * Прямоугольник1 имеет площкдь 50
//     * Круг имеет площадь 20
//     *

public class Shape {
    int side;

    public Shape() {
    }

    public double getSquare(){
        return this.side;
    }

    @Override
    public String toString() {
        return "";
    }
}