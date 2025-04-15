package net.ittimeline.java.core.foundational.method;

import java.util.Arrays;

/**
 * 方法重载案例-数组复制
 * 需求：实现① 复制所有 和 ②复制指定范围 两种数组复制方式
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 17:08
 * @since Java21
 */
public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] newArray = ArrayCopy.copy(array);
        System.out.println("********************************数组复制-原样复制********************************");
        System.out.println("原数组内容是" + Arrays.toString(array));
        System.out.println("新数组内容是" + Arrays.toString(newArray));

        System.out.println("********************************数组复制-指定区间复制********************************");
        newArray = ArrayCopy.copy(array, 5, 8);
        System.out.println("原数组内容是" + Arrays.toString(array));
        System.out.println("新数组内容是" + Arrays.toString(newArray));
    }
}
