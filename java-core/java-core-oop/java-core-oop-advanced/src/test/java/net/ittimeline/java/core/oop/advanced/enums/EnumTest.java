package net.ittimeline.java.core.oop.advanced.enums;

import java.util.Arrays;

/**
 * Enum常用方法使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:35
 * @since Java21
 */
public class EnumTest {
    /**
     * Enum常用方法
     *
     * @param args
     * @see Enum#toString()
     * @see Enum#name()
     * @see Enum#ordinal()
     * @see Season#values()
     * @see Enum#valueOf(Class, String)
     */
    public static void main(String[] args) {
        // 创建一个Season枚举实例，表示春季
        Season season = Season.WINTER;
        // 输出season的toString()方法的返回值
        System.out.println("season = " + season);
        // 输出season的name()方法的返回值
        System.out.println("season.name() = " + season.name());
        // 输出season的ordinal()方法的返回值
        System.out.println("season.ordinal() = " + season.ordinal());
        // 输出Season枚举的所有值，转换为字符串数组并输出
        System.out.println("Season.values() = " + Arrays.toString(Season.values()));
        // 输出Season枚举中值为"SPRING"的实例
        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));
    }

}
