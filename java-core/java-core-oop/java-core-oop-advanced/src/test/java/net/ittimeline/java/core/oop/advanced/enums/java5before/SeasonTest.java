package net.ittimeline.java.core.oop.advanced.enums.java5before;

/**
 * Java5之前枚举实现方式
 * 手动实现枚举-枚举使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:32
 * @since Java21
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println("Season.SPRING = " + Season.SPRING);
        System.out.println("Season.SPRING.getSeasonName() = " + Season.SPRING.getSeasonName());
        System.out.println("Season.SPRING.getSeasonDescription() = " + Season.SPRING.getSeasonDescription());
    }
}
