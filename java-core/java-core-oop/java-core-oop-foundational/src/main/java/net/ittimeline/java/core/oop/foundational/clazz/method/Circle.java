package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 方法案例：计算圆的面积和周长
 * 实体类-Circle
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:01
 * @since Java21
 */
public class Circle {
    /************************************类的成员-成员变量************************************/

    /**
     * 半径
     */
    double radius;
    /************************************类的成员-成员方法-实例方法************************************/

    /**
     * 计算圆的面积
     */
    public double calculatorArea() {
        //圆的面积 = π * r * r
        return Math.PI * radius * radius;
    }

    /**
     * 计算圆的周长
     */
    public double calculatorPerimeter() {
        //圆的周长= 2 * π * r
        return 2 * Math.PI * radius;
    }

}
