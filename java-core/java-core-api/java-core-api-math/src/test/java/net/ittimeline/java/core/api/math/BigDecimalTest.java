package net.ittimeline.java.core.api.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal常用方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/10 8:54
 * @since Java21
 */
public class BigDecimalTest {
    /**
     * @see BigDecimal#valueOf(long)
     * @see BigDecimal#valueOf(double)
     *
     * @see BigDecimal#add(BigDecimal)
     * @see BigDecimal#subtract(BigDecimal)
     * @see BigDecimal#multiply(BigDecimal)
     * @see BigDecimal#divide(BigDecimal)
     * @see BigDecimal#divide(BigDecimal, int, RoundingMode)
     *
     * @see BigDecimal#equals(Object)
     * @param args
     */
    public static void main(String[] args) {

        //1.加法运算
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(4.0);

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println("bd3 = " + bd3);


        //2.减法运算
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println("bd4 = " + bd4);

        //3.乘法运算
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println("bd5 = " + bd5);

        //4.除法运算
        BigDecimal bd6 = bd1.divide(bd2);
        System.out.println("bd6 = " + bd6);

        //5.除法运算 除尽
        BigDecimal bd7 = bd1.divide(bd2);
        System.out.println("bd7 = " + bd7);

        //5.除法运算 除不尽  保留两位小数
        BigDecimal bd8 =BigDecimal.valueOf(10.0);
        BigDecimal bd9 =BigDecimal.valueOf(3.0);

        //Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        //BigDecimal bd10 = bd8.divide(bd9);
        //System.out.println("bd10 = " + bd10);

        //解决办法
        //计算结果四舍五入保留2位小数
        BigDecimal bd10 = bd8.divide(bd9, 2, RoundingMode.HALF_UP);
        System.out.println("bd10 = " + bd10);
    }
}
