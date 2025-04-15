package net.ittimeline.java.core.foundational.method;

/**
 * 递归案例：求1~n的总和
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 10:31
 * @since Java21
 */
public class GetSumTest {
    public static void main(String[] args) {
        System.out.println("【基于循环实现】1~5的总和是" + GetSum.sumWithLoop(5));
        System.out.println("【基于递归实现】1~5的总和是" + GetSum.sumWithRecursion(5));
    }
}
