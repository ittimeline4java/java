package net.ittimeline.java.core.oop.advanced.abstractclass;

/**
 * 抽象类案例：图形计算
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:25
 * @since Java21
 */
public abstract class Shape {
    /**
     * 计算面积
     *
     * @return 周长
     */
    public abstract double calculateArea();

    /**
     * 计算周长
     *
     * @return 周长
     */
    public abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.println("这是一个图形");
    }

}
