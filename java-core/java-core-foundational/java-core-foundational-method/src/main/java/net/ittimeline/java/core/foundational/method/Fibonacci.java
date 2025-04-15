package net.ittimeline.java.core.foundational.method;

/**
 * 方法递归案例：斐波那契数列
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 10:39
 * @since Java21
 */
public class Fibonacci {

    /**
     * 使用递归实现斐波那契数列
     *
     * @param n 第n项
     * @return 斐波那契数列的第n项的值
     */
    static int fibonacciWithRecursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciWithRecursion(n - 1) + fibonacciWithRecursion(n - 2);
        }
    }

    /**
     * 使用循环实现斐波那契数列
     *
     * @param n 第n项
     * @return 斐波那契数列的第n项的值
     */
    static int fibonacciWithLoop(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;

    }
}
