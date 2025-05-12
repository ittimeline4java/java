package net.ittimeline.java.core.api.util;

import java.util.Objects;

/**
 * Objects对象相等性判断测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/8 16:57
 * @since Java21
 */
public class ObjectsEqualsTest {
    /**
     * @param args
     * @see Objects#equals(Object, Object) 比较两个对象是否相等
     * @see Objects#deepEquals(Object, Object) 比较两个对象是否相等，如果其中一个参数为数组类型，则使用Arrays.deepEquals()方法进行比较
     */
    public static void main(String[] args) {
        // 比较两个字符串是否相等
        String str1 = "java";
        String str2 = "java";
        System.out.println("Objects.equals(str1, str2) = " + Objects.equals(str1, str2));

        // 比较两个数组是否相等
        String[] array1 = {"java", "python", "go"};
        String[] array2 = {"java", "python", "go"};

        // 比较两个数组是否相等，使用Objects.equals()方法会返回false
        System.out.println("Objects.equals(array1, array2) = " + Objects.equals(array1, array2));
        // 比较两个数组是否相等，使用Objects.deepEquals()方法会返回true
        System.out.println("Objects.deepEquals(array1, array2) = " + Objects.deepEquals(array1, array2));
    }
}
