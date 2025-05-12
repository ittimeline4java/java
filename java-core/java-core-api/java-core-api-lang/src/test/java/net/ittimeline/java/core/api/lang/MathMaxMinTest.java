package net.ittimeline.java.core.api.lang;

/**
 * Math求最大值和最小值
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 12:55
 * @since Java21
 */
public class MathMaxMinTest {

    /**
     * @param args
     * @see Math#max(int, int) 求两个整数的最大值
     * @see Math#min(int, int) 求两个整数的最小值
     */
    public static void main(String[] args) {
        //求两个整数的最大值
        System.out.println("Math.max(10, 20) = " + Math.max(10, 20));
        //求两个小数的最大值
        System.out.println("Math.max(100.0, 200.0) = " + Math.max(100.0, 200.0));

        //求两个整数的最小值
        System.out.println("Math.min(5, 10) = " + Math.min(5, 10));
        //求两个小数的最小值
        System.out.println("Math.min(5.0, 10.0) = " + Math.min(5.0, 10.0));
    }
}
