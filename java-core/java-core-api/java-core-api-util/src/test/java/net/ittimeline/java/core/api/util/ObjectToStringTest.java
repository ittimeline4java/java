package net.ittimeline.java.core.api.util;

import java.util.Objects;

/**
 * Objects toString()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 8:49
 * @since Java21
 */
public class ObjectToStringTest {
    /**
     * @see Objects#toString(Object) 该方法会将null转换为"null"，而非""
     * @see Objects#toString(Object, String) 该方法会将null转换为指定的字符串，而非"null"
     * @param args
     */
    public static void main(String[] args) {
        String str1 =null;
        //
        System.out.println("Objects.toString(str1) = " + Objects.toString(str1));
        System.out.println("Objects.toString(str1,默认值) = " + Objects.toString(str1,"默认值"));

        String str2="跟光磊学Java从小白到架构师";
        System.out.println("Objects.toString(str2) = " + Objects.toString(str2));
        System.out.println("Objects.toString(str2,默认值)  = " + Objects.toString(str2,"默认值"));
    }
}
