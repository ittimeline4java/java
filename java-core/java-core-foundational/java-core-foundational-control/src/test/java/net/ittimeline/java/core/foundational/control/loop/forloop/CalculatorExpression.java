package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 计算指定表达式的值
 * 需求：计算1-1/2+1/3-1/4...+1/99-1/100的和
 * 分析：
 * 一共100项，分子为1，分母从1到100
 * 分母是奇数做加法
 * 分母是偶数做减法
 * 要把表达式的1写成1.0才能得到比较精确的值，因为1/2和1/4等等都等于0
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/9 7:53
 * @since Java21
 */
public class CalculatorExpression {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            //分母是偶数做减法
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            }
            //分母是奇数做加法
            else {
                sum += 1.0 / i;
            }

        }
        System.out.println("表达式1-1/2+1/3-1/4...+1/99-1/100的和计算的结果是" + sum);

    }
}
