package net.ittimeline.java.core.oop.intermediate.inheritance.override;

/**
 * 方法重写案例：画图形
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:37
 * @since Java21
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
