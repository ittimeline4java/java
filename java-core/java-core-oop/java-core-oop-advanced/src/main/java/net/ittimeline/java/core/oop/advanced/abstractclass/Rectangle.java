package net.ittimeline.java.core.oop.advanced.abstractclass;

/**
 * 抽象类案例：图形计算
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:27
 * @since Java21
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public void displayInfo() {
        System.out.println("这是一个矩形，宽度为：" + this.width + "，高度为：" + this.height +"，面积为：" + calculateArea() + "，周长为：" + calculatePerimeter());

    }
}
