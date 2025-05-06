package net.ittimeline.java.core.oop.advanced.annotation.deprecated;

import java.util.Date;

/**
 * Deprecated注解的使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:52
 * @since Java21
 */
public class DeprecatedAnnotationTest {
    public static void main(String[] args) {
        // 创建一个日期对象，表示2025年5月22日
        // 注意：这里的月份是从0开始的，4代表5月
        Date date = new Date(2025, 4, 22);

        // 获取年份，由于Date类的getYear方法返回的是从1900年开始的年份，
        // 因此实际年份需要加上1900
        int year = date.getYear();
        System.out.println(year); // 打印年份

        // 获取月份，由于月份是从0开始的，因此实际月份需要加1
        int month = date.getMonth();
        System.out.println(month); // 打印月份

        // 获取日期
        int day = date.getDate();
        System.out.println(day); // 打印日期
    }
}
