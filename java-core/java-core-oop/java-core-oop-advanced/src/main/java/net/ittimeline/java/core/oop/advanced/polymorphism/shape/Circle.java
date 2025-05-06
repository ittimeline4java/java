package net.ittimeline.java.core.oop.advanced.polymorphism.shape;

/**
 * 多态案例：图形面积计算
 * 子类Circle
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:38
 * @since Java21
 */
public class Circle extends Shape {
    double radius;

    Circle() {
    }
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
