package net.ittimeline.java.core.foundational.method;

/**
 * 方法可变参数案例-求多个整数的和以及平均值
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 17:45
 * @since Java21
 */
public class Calculator {

    /**
     * 定义可变参数方法
     * 计算多个整数的和
     *
     * @param numbers 多个整数
     * @return 多个整数的和
     */
    public static long sum(int... numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    /**
     * 定义可变参数方法
     * 计算多个整数的平均值
     *
     * @param numbers 多个整数
     * @return 多个整数的平均值
     */
    public static long avg(int... numbers) {
        //调用sum方法计算多个整数的和，并将计算结果赋值给变量sum
        long sum = sum(numbers);
        long avg = sum / numbers.length;
        return avg;
    }

}
