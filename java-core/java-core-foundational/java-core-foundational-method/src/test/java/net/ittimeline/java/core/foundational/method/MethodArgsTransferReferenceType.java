package net.ittimeline.java.core.foundational.method;

import java.util.Arrays;

/**
 * 方法参数传递机制内存原理-引用类型
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 18:49
 * @since Java21
 */
public class MethodArgsTransferReferenceType {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println("调用change()方法之前  array数组元素的内容是" + Arrays.toString(array));
        change(array);
        System.out.println("调用change()方法之后  array数组元素的内容是" + Arrays.toString(array));
    }

    /**
     * 修改array数组元素的值
     *
     * @param array
     */
    public static void change(int[] array) {
        if (null != array && array.length > 0) {
            //将0号索引的元素修改成100
            array[0] = 100;
        }
    }

}
