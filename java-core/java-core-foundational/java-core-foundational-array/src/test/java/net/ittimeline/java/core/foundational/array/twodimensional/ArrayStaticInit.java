package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组静态初始化
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/10 13:41
 * @since Java21
 */
public class ArrayStaticInit {
    public static void main(String[] args) {
        //二维数组声明
        int[][] intData;
        double[][] doubleData;

        //二维数组静态初始化
        intData = new int[][]{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        doubleData = new double[][]{{100.0, 200.0, 300.0}, {400.0, 500.0}, {600.0, 700.0, 800.0}};

        //二维数组声明、静态初始化-完整格式
        int[][] intValues = new int[][]{{1, 2, 3}, {4, 5, 6,}, {7, 8}};
        double[][] doubleValues = new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0}};

        //二维数组声明、静态初始化-简化格式
        String[][] stringValues = {{"上海", "北京", "深圳", "广州"}, {"纽约", "旧金山", "波士顿"}};
    }
}
