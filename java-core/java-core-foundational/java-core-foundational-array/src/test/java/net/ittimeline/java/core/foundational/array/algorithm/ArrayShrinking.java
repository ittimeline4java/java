package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组常用算法-数组缩容
 * 需求：现有数组 int[]array={1,2,3,4,5,6,7}，现在需要删除数组中索引为4的元素
 * 分析：
 * 删除数组中索引为4的元素，也就是删除5
 * 创建一个新数组newArray,长度是数组array.length-1
 * 将除索引为4的元素复制到新数组newArray
 * 将newArray赋值给array
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/11 11:23
 * @since Java21
 */
public class ArrayShrinking {
    public static void main(String[] args) {
        //定义原始数组
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("数组缩容前元素内容是" + Arrays.toString(array));

        //定义新数组，长度为原始数组减1
        int[] newArray = new int[array.length - 1];

        //定义删除元素的索引
        int deleteIndex = 4;

        //新数组起始索引
        int newArrayIndex = 0;
        //遍历原始数组
        for (int i = 0; i < array.length; i++) {
            //将原始数组中非删除索引的元素赋值给新数组
            if (i != deleteIndex) {
                newArray[newArrayIndex++] = array[i];
            }
        }
        //替换引用
        array = newArray;
        System.out.println("数组缩容后元素内容是" + Arrays.toString(array));
    }
}
