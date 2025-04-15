package net.ittimeline.java.core.foundational.method;

/**
 * main方法调用内存原理
 * 方法执行的原理：方法执行前进栈，执行完成出栈
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:48
 * @since Java21
 */
public class MainMethodInvocationPrinciple {
    /**
     * 方法调用后进虚拟机栈运行
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        int number = 100;
        System.out.println("number = " + number);
    }
}
