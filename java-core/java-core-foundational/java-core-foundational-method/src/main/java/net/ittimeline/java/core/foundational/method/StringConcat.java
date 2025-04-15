package net.ittimeline.java.core.foundational.method;

/**
 * 可变参数与方法重载案例-字符串拼接
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 17:59
 * @since Java21
 */
public class StringConcat {


    /**
     * 按照指定分隔符拼接两个字符串
     *
     * @param separator 分隔符
     * @param arg1      第一个字符串
     * @param arg2      第二个字符串
     * @return 拼接的字符串
     */
    public static String concat(String separator, String arg1, String arg2) {
        String result = "";
        result += arg1 + separator + arg2;
        return result;
    }

    /**
     * 按照指定分隔符拼接字符串
     * 如果没有字符串，返回空字符串
     *
     * @param separator 分隔符
     * @param args      字符串
     * @return 拼接字符串
     */
    public static String concat(String separator, String... args) {
        String result = "";
        for (int i = 0; i < args.length; i++) {
            //只有一个字符串或者数组中最后一个字符串不用拼接分隔符
            if (args.length == 1 || i == args.length - 1) {
                result += args[i];
            } else {
                result += args[i] + separator;
            }
        }
        return result;
    }
}
