package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 方法案例：计算圆的面积和周长
 * 需求：计算圆的面积和周长，圆有半径属性
 * 分析：略
 * 测试类-CircleTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:02
 * @since Java21
 */
public class CircleTest {
    public static void main(String[] args) {
        //创建Circle对象
        Circle circle = new Circle();
        //设置圆的半径
        circle.radius = 6.0;
        //调用计算圆的周长方法，并将方法执行结果赋值给perimeter
        double perimeter = circle.calculatorPerimeter();
        //调用计算圆的面积方法，并将方法执行结果赋值给area
        double area = circle.calculatorArea();
        //%.1f 表示保留一位小数。
        //%.15f 表示保留十五位小数。
        //%n 是换行符。
        System.out.printf("圆的半径是%.1f  圆的周长是%.15f  圆的面积是%.15f \n", circle.radius, perimeter, area);
    }
}
