package net.ittimeline.java.core.api.math;

import java.math.BigInteger;

/**
 * BigInteger常用方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/10 7:26
 * @since Java21
 */
public class BigIntegerTest {
    /**
     * @see BigInteger#valueOf(long)
     * @see BigInteger#add(BigInteger)
     * @see BigInteger#subtract(BigInteger)
     * @see BigInteger#multiply(BigInteger)
     * @see BigInteger#divide(BigInteger)
     * @see BigInteger#remainder(BigInteger)
     * @see BigInteger#divideAndRemainder(BigInteger)
     * @see BigInteger#pow(int)
     * @see BigInteger#max(BigInteger)
     * @see BigInteger#min(BigInteger)
     * @see BigInteger#longValue()
     * @see BigInteger#equals(Object)
     * @param args
     */
    public static void main(String[] args) {
        //创建两个BigInteger对象
        BigInteger bi1= BigInteger.valueOf(100);
        BigInteger bi2=BigInteger.valueOf(30);

        //计算两个BigInteger对象的和
        BigInteger sum=bi1.add(bi2);
        System.out.println("Sum: "+sum);

        //计算两个BigInteger对象的差
        BigInteger diff=bi1.subtract(bi2);
        System.out.println("Difference: "+diff);

        //计算两个BigInteger对象的乘积
        BigInteger product=bi1.multiply(bi2);
        System.out.println("Product: "+product);

        //计算两个BigInteger对象的商
        BigInteger quotient=bi1.divide(bi2);
        System.out.println("Quotient: "+quotient);

        //计算两个BigInteger对象的余数
        BigInteger remainder=bi1.remainder(bi2);
        System.out.println("Remainder: "+remainder);

        //计算两个BigInteger对象的商和余数
        BigInteger[] result=bi1.divideAndRemainder(bi2);
        System.out.println("Quotient: "+result[0]+" Remainder: "+result[1]);


        //判断两个BigInteger对象是否相等
        BigInteger bi3=BigInteger.valueOf(100);
        BigInteger bi4=BigInteger.valueOf(100);
        System.out.println("bi3.equals(bi4) = " + bi3.equals(bi4));

        //次幂
        BigInteger pow = bi3.pow(2);
        System.out.println("100的2次方 = " + pow);

        //求最大值和最小值
        BigInteger max = bi1.max(bi2);
        BigInteger min = bi1.min(bi2);
        System.out.println("最大值: " + max + ", 最小值: " + min);

        //BigInteger 转 long
        //
        BigInteger bi5 = BigInteger.valueOf(Long.MAX_VALUE);
        long longValue = bi5.longValue();
        System.out.println("BigInteger 转 long: " + longValue);

        //注意：整数超过long范围，BigInteger 转 long 会出错
        BigInteger bi6 = new BigInteger("9223372036854775808");
        long longValue2 = bi6.longValue();
        System.out.println("BigInteger 转 long: " + longValue2);
    }
}
