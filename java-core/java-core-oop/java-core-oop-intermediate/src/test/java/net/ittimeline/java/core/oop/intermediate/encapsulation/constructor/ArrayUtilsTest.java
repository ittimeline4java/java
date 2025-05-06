package net.ittimeline.java.core.oop.intermediate.encapsulation.constructor;

/**
 * 构造方法封装案例：工具类
 * 测试类-ArrayUtilsTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:31
 * @since Java21
 */
public class ArrayUtilsTest {
    public static void main(String[] args) {
        String[] cities = {"北京", "上海", "广州", "深圳"};
        System.out.println("字符串数组cities是否为空：" + ArrayUtils.isEmpty(cities));
        System.out.println("字符串数组cities是否为非空：" + ArrayUtils.isNotEmpty(cities));
        Integer[] numbers = new Integer[10];
        System.out.println("整数数组numbers是否为空：" + ArrayUtils.isEmpty(numbers));
        System.out.println("整数数组numbers是否为非空：" + ArrayUtils.isNotEmpty(numbers));
    }
}
