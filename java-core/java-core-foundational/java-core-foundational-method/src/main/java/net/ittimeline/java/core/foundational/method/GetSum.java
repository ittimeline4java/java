package net.ittimeline.java.core.foundational.method;

/**
 * 递归案例：求1~n的总和
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 10:28
 * @since Java21
 */
public class GetSum {
    /**
     * 使用循环实现计算1-n的总和
     *
     * @param number
     * @return
     */
    public static int sumWithLoop(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * 使用递归实现计算1-n的总和
     *
     * @param number
     * @return
     */
    public static int sumWithRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        return sumWithRecursion(number - 1) + number;
    }
}
