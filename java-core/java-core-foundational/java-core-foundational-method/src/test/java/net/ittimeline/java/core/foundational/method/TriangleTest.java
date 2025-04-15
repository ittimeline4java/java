package net.ittimeline.java.core.foundational.method;

/**
 * 方法重载案例-求三角形面积
 * 需求：使用① (底部 * 高) /2   和② 海伦公式 两种方式计算三角形面积
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 16:55
 * @since Java21
 */
public class TriangleTest {
    public static void main(String[] args) {
        double base = 4.0;
        double height = 5.0;
        double area = Triangle.calculateArea(base, height);
        System.out.printf("底为%.1f,高为%.1f,三角形面积为%.1f\n", base, height, area);

        double slide1 = 3.0;
        double slide2 = 4.0;
        double slide3 = 5.0;
        area = Triangle.calculateArea(slide1, slide2, slide3);
        System.out.printf("第一条边为%.1f,第二条边为%.1f,第三条边为%.1f,三角形面积为%.1f\n", slide1, slide2, slide3, area);
    }
}
