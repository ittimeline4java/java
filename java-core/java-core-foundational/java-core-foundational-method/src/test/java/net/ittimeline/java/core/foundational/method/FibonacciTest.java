package net.ittimeline.java.core.foundational.method;

/**
 * 方法递归案例：斐波那契数列
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 10:41
 * @since Java21
 */
public class FibonacciTest {

    public static void main(String[] args) {
        System.out.println("********************************基于递归实现打印24项斐波那契数列********************************");
        int n = 24;
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci.fibonacciWithRecursion(i) + "\t");
        }
        System.out.println();
        System.out.println("********************************基于循环实现打印24项斐波那契数列********************************");

        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci.fibonacciWithLoop(i) + "\t");
        }
    }
}
