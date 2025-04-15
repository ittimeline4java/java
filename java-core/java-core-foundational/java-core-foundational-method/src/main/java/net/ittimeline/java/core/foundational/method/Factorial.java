package net.ittimeline.java.core.foundational.method;

/**
 * 方法递归案例：计算n的阶乘
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 10:35
 * @since Java21
 */
public class Factorial {
    /**
     * 基于递归实现计算1到n的阶乘
     *
     * @param n 数值
     * @return 1到n的阶乘
     */
    public static int factorialWithRecursion(int n) {
        if (n == 1) return 1;

        return n * factorialWithRecursion(n - 1);
    }

    /**
     * 基于循环实现计算1到n的阶乘
     *
     * @param n 数值
     * @return 1到n的阶乘
     */
    public static int factorialWithLoop(int n) {
        if (n == 1) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
