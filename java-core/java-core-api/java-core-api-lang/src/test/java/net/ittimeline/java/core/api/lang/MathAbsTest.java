package net.ittimeline.java.core.api.lang;

/**
 * Math abs()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 12:34
 * @since Java21
 */
public class MathAbsTest {
    /**
     *
     * @see Math#abs(int)  求整数的绝对值
     * @see Math#abs(long)
     * @see Math#abs(float)
     * @see Math#abs(double)
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Math.abs(100) = " + Math.abs(100));
        System.out.println("Math.abs(-100) = " + Math.abs(-100));
        System.out.println("Math.abs(100.0) = " + Math.abs(100.0));
        System.out.println("Math.abs(100_0000_0000L) = " + Math.abs(100_0000_0000L));
    }
}
