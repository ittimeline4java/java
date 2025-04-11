package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组反转算法-反转-对称数组
 * 需求：判断数组是不是对称数组，例如 1 2 3 4 5 4 3 2 1 是一个对称数组，1 2 3 4 5 4 3 2 1 0不是一个对称数组
 * 分析：
 * 假设array表示数组，i表示数组元素的头索引，j表示数组元素的尾索引
 * 判断是否为对称就是依次判断array[i]和array[j]是否相等，如果相等就是对称数组，否则就不是对称数组。
 * 判断的条件就是i小于j
 * 判断一次后，头索引i++，尾索引j--
 * 实现方式2
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/11 10:44
 * @since Java21
 */
public class SymmetricArrayV2 {
    public static void main(String[] args) {
        {
            //对称数组测试用例
            int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
            boolean isSymmetric = true;
            int i = 0;
            int j = array.length - 1;
            while (i < j) {
                if (array[i] != array[j]) {
                    isSymmetric = false;
                    break;
                }
                i++;
                j--;
            }
            if (isSymmetric) {
                System.out.println(Arrays.toString(array) + "是对称数组");
            } else {
                System.out.println(Arrays.toString(array) + "不是对称数组");
            }
        }

        {
            //非对称数组测试用例
            int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};

            boolean isSymmetric = true;
            int i = 0;
            int j = array.length - 1;
            while (i < j) {
                if (array[i] != array[j]) {
                    isSymmetric = false;
                    break;
                }
                i++;
                j--;
            }
            if (isSymmetric) {
                System.out.println(Arrays.toString(array) + "是对称数组");
            } else {
                System.out.println(Arrays.toString(array) + "不是对称数组");
            }
        }

    }
}
