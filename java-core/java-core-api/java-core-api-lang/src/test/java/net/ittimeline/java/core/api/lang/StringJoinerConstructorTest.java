package net.ittimeline.java.core.api.lang;

import java.util.StringJoiner;

/**
 * StringJoiner构造方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 17:47
 * @since Java21
 */
public class StringJoinerConstructorTest {
    /**
     * @see StringJoiner#StringJoiner(CharSequence delimiter)
     * @see StringJoiner#StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
     * @param args
     */
    public static void main(String[] args) {
        StringJoiner stringJoiner1=new StringJoiner(",");
        System.out.println("stringJoiner1 = " + stringJoiner1);

        StringJoiner stringJoiner2=new StringJoiner(",","[","]");
        System.out.println("stringJoiner2 = " + stringJoiner2);

    }
}
