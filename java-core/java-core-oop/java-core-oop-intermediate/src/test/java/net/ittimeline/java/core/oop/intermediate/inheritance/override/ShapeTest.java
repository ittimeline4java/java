package net.ittimeline.java.core.oop.intermediate.inheritance.override;

/**
 * 方法重写案例：画图形
 * 创建一个图形类层次结构，其中包含一个基类Shape和两个子类Circle和Rectangle。
 * 每个子类都将重写基类中的draw方法，以提供特定的实现
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:38
 * @since Java21
 */
public class ShapeTest {
    public static void main(String[] args) {
        // 创建一个Shape对象
        Shape shape = new Shape();

        // 创建一个Circle对象
        Circle circle = new Circle();

        // 创建一个Rectangle对象
        Rectangle rectangle = new Rectangle();

        // 调用Shape对象的draw方法
        shape.draw();

        // 调用Circle对象的draw方法
        circle.draw();

        // 调用Rectangle对象的draw方法
        rectangle.draw();
    }
}
