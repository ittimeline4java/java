package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组常见算法-反转
 * 需求：定义一个数组并存储1，2，3，4，5，反转之后是5，4，3，2，1
 * 分析：
 * 假设array表示数组，i表示数组元素的头索引，j表示数组元素的尾索引
 * 交换的元素就是array[i]和array[j]依次交换
 * 交换的条件就是i小于j
 * 每交换一次后，头索引i++，尾索引j--
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/11 10:13
 * @since Java21
 */
public class ArrayReversalV2 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println("数组反转之前数组元素内容是：" + Arrays.toString(array));
        //i表示数组元素的头索引
        int i = 0;
        //j表示数组元素的尾索引
        int j = array.length - 1;
        while (i < j) {
            //array[i]和array[j]位置的元素交换
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            //头索引自增
            i++;
            //尾索引自减
            j--;
        }

        System.out.println("数组反转之后数组元素内容是：" + Arrays.toString(array));

    }
}
