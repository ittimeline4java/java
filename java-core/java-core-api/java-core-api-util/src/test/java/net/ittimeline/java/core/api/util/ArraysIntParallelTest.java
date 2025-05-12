package net.ittimeline.java.core.api.util;

import java.util.Arrays;

/**
 * Arrays parallelSort()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/12 9:02
 * @since Java21
 * @see ArrayGenerator
 */
public class ArraysIntParallelTest {
    /**
     * @see Arrays#parallelSort(int[])
     * @param args
     */
    public static void main(String[] args) {
        parallelSort();
        sort();
    }


    /**
     * 并行排序测试
     */
    private static void parallelSort() {
        int[] array = ArrayGenerator.generateIntArray(90_000_000);
        long parallelSortStartTime = System.currentTimeMillis();
        Arrays.parallelSort(array);
        long parallelSortEndTime = System.currentTimeMillis();
        long parallelSortTime = parallelSortEndTime - parallelSortStartTime;
        System.out.println("九千万数据并行排序耗时：" + parallelSortTime+"毫秒");
    }

    /**
     * 常规排序测试
     */
    private static void sort() {
        int[] array = ArrayGenerator.generateIntArray(90_000_000);
        long sortStartTime = System.currentTimeMillis();
        Arrays.sort(array);
        long sortEndTime = System.currentTimeMillis();
        long sortTime = sortEndTime - sortStartTime;
        System.out.println("九千万数据常规排序耗时：" + sortTime+"毫秒");
    }
}
