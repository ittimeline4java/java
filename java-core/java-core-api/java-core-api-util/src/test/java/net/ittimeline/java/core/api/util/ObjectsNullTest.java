package net.ittimeline.java.core.api.util;

import java.util.Objects;

/**
 * Objects对象判空方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/8 16:21
 * @since Java21
 */
public class ObjectsNullTest {
    /**
     * @see Objects#isNull(Object) 判断对象是否为null
     * @see Objects#nonNull(Object) 判断对象是否不为null
     * @param args
     */
    public static void main(String[] args) {
        String str1 = null;
        String str2="跟光磊学Java从小白到架构师";
        //对象判空
        System.out.println("Objects.isNull(str1) = " + Objects.isNull(str1));//true
        System.out.println("Objects.nonNull(str2) = " + Objects.nonNull(str2)); //true
    }
}
