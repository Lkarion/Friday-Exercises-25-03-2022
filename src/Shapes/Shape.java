package Shapes;

// 1.создать классы содержащие методы для подсчета площади прямоугольника
//     * квадарата и круга. Кроме результата подсчета должно выводиться также
//     * название соответствующей фигуры. Создать массив таких обьектов и вывести
//     * его на экран
//     * Прямоугольник1 имеет площкдь 50
//     * Круг имеет площадь 20
//     *

public class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public double getSquare(){
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
