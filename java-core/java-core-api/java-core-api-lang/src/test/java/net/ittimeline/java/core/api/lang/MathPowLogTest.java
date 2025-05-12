package net.ittimeline.java.core.api.lang;

/**
 * Math幂和对数运算方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 12:46
 * @since Java21
 */
public class MathPowLogTest {
    /**
     * @see Math#pow(double a, double b)：计算 a 的 b 次幂，返回 double 类型的结果。
     * @see Math#sqrt(double a)：计算参数的平方根，返回 double 类型的结果。
     * @see Math#cbrt(double a)：计算参数的立方根，返回 double 类型的结果。
     * @see Math#exp(double a)：返回 e 的 a 次幂，返回 double 类型的结果。
     * @see Math#log(double a)：返回参数的自然对数（以 e 为底），返回 double 类型的结果。
     * @see Math#log10(double a)：返回参数的常用对数（以 10 为底），返回 double 类型的结果。
     * @see Math#log1p(double a)：返回 1 与参数之和的自然对数，返回 double 类型的结果
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("4.0 的 3 次幂：" + Math.pow(4.0, 3.0)); // 64.0
        System.out.println("25 的平方根：" + Math.sqrt(25)); // 5.0
        System.out.println("125 的立方根：" + Math.cbrt(125)); // 5.0
        System.out.println("e 的 2.0 次幂：" + Math.exp(2.0)); // 7.38905609893065
        System.out.println("2.0 的自然对数：" + Math.log(2.0)); // 0.6931471805599453
        System.out.println("2.0 的常用对数：" + Math.log10(2.0)); // 0.3010299956639812
        System.out.println("1 与 2.0 之和的自然对数：" + Math.log1p(2.0)); // 1.6931471805599453
    }
}
