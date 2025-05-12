package net.ittimeline.java.core.api.lang;

/**
 * 字符串拼接底层原理-拼接字面量
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 18:16
 * @since Java21
 */
public class StringAppendLiteralTest {
    public static void main(String[] args) {
        //拼接的时候没有变量，都是字符串
        //触发字符串的优化机制，在编译的时候就已经是最终的结果了
        String  s ="a" + "b" + "c";
        System.out.println(s);
    }
}
