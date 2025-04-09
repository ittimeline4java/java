package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印偶数并统计
 * 需求：打印1到100的偶数，并且统计偶数的个数以及偶数的累加和
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 20:06
 * @since Java21
 */
public class PrintEvenNumberStatistics {
    public static void main(String[] args) {
        //偶数和
        int evenNumberSum = 0;
        //偶数个数
        int evenNumberCount = 0;

        //从1遍历到100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                //偶数和累加
                evenNumberSum += i;
                //偶数个数累加
                evenNumberCount++;
            }
        }
        System.out.printf("1到100的偶数和是%d，偶数个数是%d", evenNumberSum, evenNumberCount);
    }
}
