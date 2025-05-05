package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法案例：计算长方形周长和面积
 * 需求：计算长方形的面积和周长，长方形有长和宽两个属性
 * 分析：略
 * 测试类-RectangleTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:01
 * @since Java21
 */
public class RectangleTest {
    public static void main(String[] args) {
        //创建Rectangle对象
        Rectangle rectangle = new Rectangle();
        //设置长方形的长度和宽度
        rectangle.length = 20.0;
        rectangle.width = 5.0;
        //调用计算周长的方法，并将方法执行结果赋值给perimeter
        double perimeter = rectangle.calculatePerimeter();
        //调用计算面积的方法，并将方法执行结果赋值给area
        double area = rectangle.calculateArea();
        //%.1f 表示保留一位小数。
        //%n 是换行符。
        System.out.printf("长方形的长度是%.1f  宽度是%.1f 周长是%.1f 面积是%.1f\n",
                rectangle.length, rectangle.width, perimeter, area);
    }
}
