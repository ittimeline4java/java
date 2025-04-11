package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 线性查找算法-查找整数
 * 需求：定义数组int[] array = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};，查找元素5是否在数组中出现过，如果出现输出首次出现的索引值
 * 分析：遍历数组，将查找的元素和数组中的元素依次进行比较，如果第一次相等则表示出现过（找到了），此时记录对应的索引并终止循环，否则表示没有出现过（没找到）
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/11 17:25
 * @since Java21
 */
public class LinearSearchIntData {
    public static void main(String[] args) {
        int[] array = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int targetElement = 5;
        int targetIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (targetElement == array[i]) {
                targetIndex = i;
                break;
            }
        }
        if (targetIndex != -1) {
            System.out.println(targetElement + "在数组" + Arrays.toString(array) + "中找到了，索引位置是" + targetIndex);
        } else {
            System.out.println(targetElement + "在数组" + Arrays.toString(array) + "中没有找到");
        }
    }
}
