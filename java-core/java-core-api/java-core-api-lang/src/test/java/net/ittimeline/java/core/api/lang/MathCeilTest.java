package net.ittimeline.java.core.api.lang;

/**
 * Math取整方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 12:40
 * @since Java21
 */
public class MathCeilTest {

    /**
     * @see Math#ceil(double)  返回大于或等于参数的最小整数，返回值类型为 double 向上取整
     * @see Math#floor(double)  返回小于或等于参数的最大整数，返回值类型为 double 向下取整
     * @see Math#round(double)  将 float 类型的参数四舍五入为最接近的整数，返回值类型为 int；对于 double 类型参数也有重载方法，返回值类型为 long  四舍五入
     * @see Math#rint(double)  返回与参数最接近的整数，返回 double 类型值。如果两个整数一样近，则返回偶数那一个
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Math.ceil(123.456) = " + Math.ceil(123.456)); //124.0
        System.out.println("Math.floor(123.456) = " + Math.floor(123.456)); //123.0
        System.out.println("Math.round(123.456) = " + Math.round(123.456)); //123
        System.out.println("Math.rint(123.456) = " + Math.rint(123.456)); //123
        System.out.println("Math.ceil(-123.456) = " + Math.ceil(-123.456)); //-123
        System.out.println("Math.floor(-123.456) = " + Math.floor(-123.456)); //-124
        System.out.println("Math.round(-123.456) = " + Math.round(-123.456)); //-123
    }
}
