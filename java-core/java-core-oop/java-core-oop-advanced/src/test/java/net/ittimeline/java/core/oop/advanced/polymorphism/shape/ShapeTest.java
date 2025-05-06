package net.ittimeline.java.core.oop.advanced.polymorphism.shape;

/**
 * 多态案例：图形面积计算
 * 测试类-ShapeTest
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:40
 * @since Java21
 */
public class ShapeTest {

    /**
     * 打印面积
     * 方法接收抽象类类型参数，体现多态
     * @param shape 形状对象
     */
    public static void printArea(Shape shape) {
        System.out.printf("面积：%.2f\n", shape.area());
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(5);      // 抽象类引用指向Circle对象
        Shape s2 = new Rectangle(3,4); // 抽象类引用指向Rectangle对象
        printArea(s1); // 输出 78.54
        printArea(s2); // 输出 12.0
    }
}
