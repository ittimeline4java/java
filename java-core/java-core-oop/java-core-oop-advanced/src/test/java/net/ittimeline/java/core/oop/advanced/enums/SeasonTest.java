package net.ittimeline.java.core.oop.advanced.enums;

/**
 * Java5新特性：枚举
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:34
 * @since Java21
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println("Season.SPRING = " + Season.SPRING);
        System.out.println("Season.SPRING.getSeasonName() = " + Season.SPRING.getSeasonName());
        System.out.println("Season.SPRING.getSeasonDescription() = " + Season.SPRING.getSeasonDescription());
        System.out.println("Season.SPRING.getClass() = " + Season.SPRING.getClass());
        System.out.println("Season.SPRING.getClass().getSuperclass() = " + Season.SPRING.getClass().getSuperclass());
        System.out.println("Season.SPRING.getClass().getSuperclass()..getSuperclass() = " + Season.SPRING.getClass().getSuperclass().getSuperclass());

    }
}