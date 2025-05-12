package net.ittimeline.java.core.api.lang;

/**
 * 包装类 compare()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 20:31
 * @since Java21
 */
public class WrapperClassCompareTest {

    /**
     *  整数、小数的比较
     * @see Integer#compare(int, int) 大于返回1  小于返回-1  等于返回0
     * @see Double#compare(double, double) 大于返回1  小于返回-1  等于返回0
     * @param args
     */
    public static void main(String[] args) {
        //两个整数的比较
        System.out.println("Integer.compare(20, 10) = " + Integer.compare(20, 10));
        System.out.println("Integer.compare(10, 20) = " + Integer.compare(10, 20));
        System.out.println("Integer.compare(10, 10) = " + Integer.compare(10, 10));

        //两个小数的比较
        System.out.println("Double.compare(20.0, 10.0) = " + Double.compare(20.0, 10.0));
        System.out.println("Double.compare(10.0, 20.0) = " + Double.compare(10.0, 20.0));
        System.out.println("Double.compare(10.0, 10.0) = " + Double.compare(10.0, 10.0));
    }
}
