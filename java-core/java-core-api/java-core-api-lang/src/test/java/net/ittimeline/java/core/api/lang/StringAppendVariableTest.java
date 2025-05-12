package net.ittimeline.java.core.api.lang;

/**
 * 字符串拼接的底层原理-拼接变量
 * @author tony 18601767221@163.com
 * @version 2025/5/11 18:20
 * @since Java21
 */
public class StringAppendVariableTest {
    public static void main(String[] args) {
        String s1="a";
        String s2=s1+"b";
        String s3=s2+"c";
        System.out.println(s3);
    }
}
