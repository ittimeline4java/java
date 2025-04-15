package net.ittimeline.java.core.foundational.method;

import java.util.Scanner;

/**
 * 方法案例：统计数字出现次数
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 13:02
 * @since Java21
 */
public class DigitCounterTest {
    public static void main(String[] args) {

        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数，例如123123或者456789456789");
        long number = scanner.nextLong();
        long[] countDigits = DigitCounter.countDigits(number);
        DigitCounter.printCountDigits(countDigits);

        //关闭Scanner
        scanner.close();
    }
}
