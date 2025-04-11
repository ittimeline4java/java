package net.ittimeline.java.core.foundational.array;

/**
 * 数组静态初始化
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/10 8:31
 * @since Java21
 */
public class ArrayStaticInit {
    public static void main(String[] args) {
        //数组声明的语法格式：数据类型[] 数组名;
        //声明基本类型元素的数组
        int[] numbers;
        double[] prices;
        char[] chars;

        //声明引用类型元素的数组
        String[] cities;

        //数组静态初始化
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        prices = new double[]{5399.0, 8999.0, 9899.0};

        //数组声明与静态初始化完整格式
        int[] values = new int[]{10, 20, 30, 40, 50, 60, 70, 80};

        //数组声明与静态初始化简化格式
        String[] products = {"iPhone16", "iPhone16 Pro", "iPhone 16 Pro max"};
    }
}
