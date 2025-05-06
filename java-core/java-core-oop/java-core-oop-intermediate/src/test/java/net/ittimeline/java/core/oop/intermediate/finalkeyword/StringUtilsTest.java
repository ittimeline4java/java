package net.ittimeline.java.core.oop.intermediate.finalkeyword;

/**
 * final关键字修饰类案例：字符串工具类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 9:37
 * @since Java21
 */
public class StringUtilsTest {
    public static void main(String[] args) {
        String str = "";
        System.out.println("str 是否为空：" + StringUtils.isEmpty(str));

        String name = "tony";
        System.out.println("name 是否为空：" + StringUtils.isEmpty(name));
    }
}
