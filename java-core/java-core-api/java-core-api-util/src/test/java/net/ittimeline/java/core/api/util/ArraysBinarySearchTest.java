package net.ittimeline.java.core.api.util;

import java.util.Arrays;

/**
 * Arrays binarySearch()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/12 7:45
 * @since Java21
 */
public class ArraysBinarySearchTest {
    /**
     * @see Arrays#binarySearch(int[], int)
     * @see Arrays#binarySearch(Object[], Object)
     * @param args
     *
     */
    public static void main(String[] args) {
        //二分法查找的前提是数组是有序的，必须是升序的
        // 如果要查找的元素存在，返回的是元素的索引，
        // 如果要查找的元素不存在，返回的是 -插入点 -1 例如120 应该插入的位置是10，-插入点-1 = -10 -1 = -11
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Arrays.binarySearch(array, 50) = " + Arrays.binarySearch(array, 50)); //4
        System.out.println("Arrays.binarySearch(array, 100) = " + Arrays.binarySearch(array, 100)); //9
        System.out.println("Arrays.binarySearch(array, 120) = " + Arrays.binarySearch(array, 120)); //-11
    }
}
