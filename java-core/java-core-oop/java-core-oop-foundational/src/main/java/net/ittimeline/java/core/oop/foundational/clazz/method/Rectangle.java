package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法案例：计算长方形的面积和周长
 * 实体类-Rectangle
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:00
 * @since Java21
 */
public class Rectangle {
    /************************************类的成员-成员变量************************************/

    /**
     * 长度
     */
    double length;
    /**
     * 宽度
     */
    double width;
    /************************************类的成员-成员方法-实例方法************************************/

    /**
     * 计算长方形周长
     *
     * @return 长方形周长
     */
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    /**
     * 计算长方形面积
     *
     * @return 长方形面积
     */
    public double calculateArea() {
        return length * width;
    }
}
