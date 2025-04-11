package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组动态初始化
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/10 13:52
 * @since Java21
 */
public class ArrayDynamicInit {
    public static void main(String[] args) {
        //二维数组动态初始化方式1
        //4表示外层元素个数
        //3表示内层元素个数
        double[][] sales = new double[4][3];

        //二维数组动态初始化方式2
        //4表示外层元素个数，内层元素个数不确定
        double[][] prices = new double[4][];
    }
}
