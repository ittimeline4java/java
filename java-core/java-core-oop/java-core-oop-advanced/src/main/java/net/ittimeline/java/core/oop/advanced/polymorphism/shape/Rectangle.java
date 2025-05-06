package net.ittimeline.java.core.oop.advanced.polymorphism.shape;

/**
 * 多态案例：图形面积计算
 * 子类Rectangle
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:39
 * @since Java21
 */
public class Rectangle extends Shape {

    double width;
    double height;

    Rectangle(double weight, double height) {
        this.width = weight;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}
