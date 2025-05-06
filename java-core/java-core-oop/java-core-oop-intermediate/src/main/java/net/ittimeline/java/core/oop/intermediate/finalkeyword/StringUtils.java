package net.ittimeline.java.core.oop.intermediate.finalkeyword;

/**
 * final关键字修饰类案例：字符串工具类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 9:37
 * @since Java21
 */
public class StringUtils {
    /**
     * 私有化构造器
     */
    private StringUtils() {

    }

    /**
     * 判断字符串是否为空
     *
     * @param str 字符串
     * @return true 空  false 非空
     */
    public static boolean isEmpty(String str) {
        // 判断字符串是否为null或经过trim处理后的字符串是否为空
        return str == null || str.trim().isEmpty();
    }

}
