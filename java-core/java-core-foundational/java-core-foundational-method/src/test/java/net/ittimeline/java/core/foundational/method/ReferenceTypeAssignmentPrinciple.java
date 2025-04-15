package net.ittimeline.java.core.foundational.method;

import java.util.Arrays;

/**
 * 引用类型赋值原理
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 18:38
 * @since Java21
 */
public class ReferenceTypeAssignmentPrinciple {
    public static void main(String[] args) {
        //引用数据类型 变量存储的是内存(堆内存)地址值
        int[] array1 = new int[]{10, 20, 30};

        System.out.println("array1 = " + array1);
        System.out.println("array1数组元素的内容是" + Arrays.toString(array1));

        //引用数据类型 赋值给其他变量，赋的是地址值，而不是真实的值
        int[] array2 = array1;
        System.out.println("array2 = " + array2);
        System.out.println("array2数组元素的内容是" + Arrays.toString(array1));
    }
}
