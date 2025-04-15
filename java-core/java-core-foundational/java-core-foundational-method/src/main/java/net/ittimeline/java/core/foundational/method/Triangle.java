package net.ittimeline.java.core.foundational.method;

/**
 * 方法重载案例-求三角形面积
 * 三角形
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 16:54
 * @since Java21
 */
public class Triangle {

    /**
     * 定义有参有返回值静态方法  2个参数
     * 求三角形面积
     * 三角形面积计算公式
     * 底 * 高  /2
     *
     * @return 三角形面积
     */
    public static double calculateArea(double base, double height) {
        //参数校验
        if (base <= 0 || height <= 0) {
            System.err.println("底和高必须是正整数");
            return 0.0;
        }
        return base * height / 2;
    }

    /**
     * 定义有参有返回值静态方法 3个参数
     * 求三角形面积
     * 三角形面积计算公式：海伦公式 √[s(s-a)(s-b)(s-c)]
     *
     * @param side1 第一条边
     * @param side2 第二条边
     * @param side3 第三条边
     * @return 三角形的面积
     */
    public static double calculateArea(double side1, double side2, double side3) {
        //参数校验
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.err.println("参数错误");
            return 0.0;
        }
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.err.println("参数错误");
            return 0.0;
        }
        //求半周长
        double s = (side1 + side2 + side3) / 2;
        //计算面积
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
