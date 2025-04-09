package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 需求：使用for循环输出5个Hello World
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 19:20
 * @since Java21
 */
public class ForLoop {
    public static void main(String[] args) {
        System.out.println("1.不使用for循环实现输出5个Hello World");

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("2.使用for循环实现输出5个Hello World");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
}
