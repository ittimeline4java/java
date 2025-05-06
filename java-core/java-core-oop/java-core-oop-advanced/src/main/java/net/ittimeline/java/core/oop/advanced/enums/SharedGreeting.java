package net.ittimeline.java.core.oop.advanced.enums;

/**
 * 枚举实现接口案例：打招呼枚举
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:36
 * @since Java21
 */
public enum SharedGreeting implements Greeting {
    MORNING,
    AFTERNOON,
    EVENING;

    @Override
    public void greet() {
        System.out.println("Good " + this.name().toLowerCase() + "!");
    }
}
