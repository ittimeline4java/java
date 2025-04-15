package net.ittimeline.java.core.foundational.method;

/**
 * 方法案例：统计数字出现次数
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 12:58
 * @since Java21
 */
public class DigitCounter {


    /**
     * 统计整数每个数字出现的次数
     *
     * @param number
     * @return
     */
    public static long[] countDigits(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("整数必须大于0");
        }

        //动态初始化数组，数组长度为10，索引0~9分别对应数字0到9 每个索引对应的值就是数字出现的次数
        long[] digitCountArray = new long[10];
        //处理number为0的情况
        if (number == 0) {
            digitCountArray[0] = 1;
        }
        while (number > 0) {
            //获取整数的每个数字
            int digit = (int) (number % 10);
            //每个索引对应的值就是数字出现的次数
            digitCountArray[digit]++;
            number /= 10;
        }
        return digitCountArray;
    }

    /**
     * 打印输出每个数字出现的次数
     *
     * @param digitCountArray 整数数组
     */
    public static void printCountDigits(long[] digitCountArray) {
        for (int i = 0; i < digitCountArray.length; i++) {
            if (digitCountArray[i] > 0) {
                System.out.printf("数字%d出现%d次\n", i, digitCountArray[i]);
            }
        }
    }
}
