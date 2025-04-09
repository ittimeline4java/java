package net.ittimeline.java.core.foundational.control.loop.continuestatement;

/**
 * 需求：打印1到10，遇到4不打印
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/9 12:26
 * @since Java21
 */
public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                //结束本次循环，继续下一次循环
                continue;
            }
            System.out.println(i);
        }
    }
}
