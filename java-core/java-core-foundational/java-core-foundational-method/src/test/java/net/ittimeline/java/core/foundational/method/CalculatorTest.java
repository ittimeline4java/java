package net.ittimeline.java.core.foundational.method;

/**
 * 方法可变参数案例-求多个整数和
 * 需求：计算多个整数的和
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 17:52
 * @since Java21
 */
public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("两个整数相加的结果是" + Calculator.sum(10, 20));
        System.out.println("三个整数相加的结果是" + Calculator.sum(10, 20, 30));
        System.out.println("一个整数数组的所有元素相加的结果是" + Calculator.sum(new int[]{10, 20, 30}));

        int[] numbers = {100, 200, 300};
        long sum = Calculator.sum(numbers);
        System.out.println("100、200、300三个整数的和是" + sum);
        long avg = Calculator.avg(numbers);
        System.out.println("100、200、300三个整数的平均值是" + avg);

    }
}
