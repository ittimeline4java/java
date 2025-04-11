package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 选择排序基础版
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/11 18:09
 * @since Java21
 */
public class SelectionSortBasic {
    public static void main(String[] args) {
        //① 准备测试数据
        //创建Scanner对象
        //System.in 标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入待排序整数的个数");
        int length = scanner.nextInt();
        System.out.println("请输入待排序的整数（每输完一个就回车）");
        //排序的数据有5个
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        //②选择排序实现
        System.out.println("选择排序基础版【升序排序】之前数组元素内容是" + Arrays.toString(array));

        //外层循环控制轮数
        int round = 0;
        //一共比较array.length-1轮

        for (int i = 0; i < array.length - 1; i++) {
            round++;
            //内层循环控制每轮比较的次数，每轮的比较的次数减少1次
            int count = 0;
            for (int j = i + 1; j < array.length; j++) {
                //array[i]和array[j]进行比较
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                count++;
                System.out.printf("第%d轮 第%d次比较后，数组的元素是%s\n", round, count, Arrays.toString(array));

            }
        }
        System.out.println("选择排序基础版【升序排序】之后数组元素内容是" + Arrays.toString(array));
    }

}
