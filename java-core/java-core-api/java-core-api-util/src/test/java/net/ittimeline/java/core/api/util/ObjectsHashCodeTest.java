package net.ittimeline.java.core.api.util;

import java.util.Objects;

/**
 * Objects hashCode()方法和hash()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 8:38
 * @since Java21
 */
public class ObjectsHashCodeTest {
    /**
     * @see Objects#hashCode(Object) 该方法可以计算任意对象的哈希码，如果传入的对象为null,则返回0
     * @see Objects#hash(Object...) 该方法可以计算任意对象的哈希码，如果传入的对象为null,则返回0
     * @param args
     */
    public static void main(String[] args) {
        String str1="java";
        String str2="java";
        System.out.println("Objects.hashCode(str1) = " + Objects.hashCode(str1));
        System.out.println("Objects.hashCode(str2) = " + Objects.hashCode(str2));
        System.out.println("Objects.hashCode(null) = " + Objects.hashCode(null));

        String name ="tony";
        Integer age =32;
        System.out.println("Objects.hash(name,age) = " + Objects.hash(name, age));
        System.out.println("Objects.hash(null) = " + Objects.hash(null));
    }
}
