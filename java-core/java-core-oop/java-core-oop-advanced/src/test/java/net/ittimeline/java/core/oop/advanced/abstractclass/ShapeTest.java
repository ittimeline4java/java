package net.ittimeline.java.core.oop.advanced.abstractclass;

/**
 * 抽象类案例：图形结算
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:27
 * @since Java21
 */
public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.displayInfo();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.displayInfo();
    }
}
