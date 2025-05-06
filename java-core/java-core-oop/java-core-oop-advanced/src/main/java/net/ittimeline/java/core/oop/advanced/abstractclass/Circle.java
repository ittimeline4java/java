package net.ittimeline.java.core.oop.advanced.abstractclass;

/**
 * 抽象类案例：图形计算
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:26
 * @since Java21
 */
public class Circle extends Shape {
    /**
     * 半径
     */
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("这是一个圆形，半径为："+radius+"，面积为："+calculateArea()+"，周长为："+calculatePerimeter());
    }
}
