package net.ittimeline.java.core.foundational.method;

/**
 * 方法递归案例：计算n的阶乘
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 10:37
 * @since Java21
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println("【基于循环实现】5的阶乘是" + Factorial.factorialWithRecursion(5));
        System.out.println("【基于递归实现】5的阶乘是" + Factorial.factorialWithLoop(5));

    }
}
