package net.ittimeline.java.core.oop.advanced.enums;

/**
 * 枚举实现接口案例：打招呼枚举
 * 枚举类实现接口，在枚举类中重写接口的抽象方法，当通过不同的枚举类对象调用此方法时，执行的是同一个方法。
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:37
 * @since Java21
 */
public class ShareGreetingTest {
    public static void main(String[] args) {
        SharedGreeting.MORNING.greet();    // 输出 "Good morning!"
        SharedGreeting.AFTERNOON.greet();   // 输出 "Good afternoon!"
        SharedGreeting.EVENING.greet();     // 输出 "Good evening!"
    }
}
