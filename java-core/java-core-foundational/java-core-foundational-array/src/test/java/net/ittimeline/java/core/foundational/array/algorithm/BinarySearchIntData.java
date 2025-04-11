package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组常用算法-二分法查找-查找整数
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/11 17:34
 * @since Java21
 */
public class BinarySearchIntData {
    public static void main(String[] args) {
        //定义有序整数数组
        int[] array = {2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};

        //定义头索引
        int headIndex = 0;
        //定义尾索引
        int tailIndex = array.length - 1;
        //定义查找的元素
        int targetElement = 5;
        //定义查找元素的位置
        int targetIndex = -1;
        //定义查找的次数
        int count = 0;
        //当头索引小于等于尾索引
        while (headIndex <= tailIndex) {
            //计数器累加
            count++;
            //计算中间索引
            //int middleIndex = (headIndex + tailIndex) / 2;
            int middleIndex = headIndex + (tailIndex - headIndex) / 2;
            //查找的目标元素和中间值比较
            //如果目标元素比中间值大
            if (targetElement > array[middleIndex]) {
                //头索引=中间索引加1
                headIndex = middleIndex + 1;

            }
            //如果目标元素比中间值小
            else if (targetElement < array[middleIndex]) {
                //尾索引=中间值减1
                tailIndex = middleIndex - 1;
            }
            //找到了
            else {
                //记录找到元素的索引位置
                targetIndex = middleIndex;
                //结束循环（只找第一次出现的位置）
                break;
            }


        }
        if (targetIndex != -1) {
            //System.out.println(targetElement + "在数组" + Arrays.toString(array) + "中找到了，索引位置是" + targetIndex+"一共找了"+count+"次");
            System.out.printf("%d在数组%s中找到了，索引位置是%d，一共找了%d次\n", targetElement, Arrays.toString(array), targetIndex, count);
        } else {
            System.out.println(targetElement + "在数组" + Arrays.toString(array) + "中没有找到");
        }
    }
}
