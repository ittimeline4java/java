package net.ittimeline.java.core.api.util;

import java.util.Random;

/**
 * 数组生成器
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/12 7:53
 * @since Java21
 */
public final class ArrayGenerator {

    static final Random RANDOM = new Random();

    private ArrayGenerator() {

    }

    /**
     * 生成随机整数数组
     * @param size 指定长度
     * @return 随机整数数组
     */
    public static int[] generateIntArray(final int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("数组长度必须大于0");
        }
        // 初始化一个长度为size的整数数组
        int[] array = new int[size];
        // 遍历数组
        for (int i = 0; i < array.length; i++) {
            // 生成指定范围[1,size]内的随机整数，并赋值给数组元素
            array[i] = RANDOM.nextInt(size) + 1;
        }
        // 返回生成的随机整数数组
        return array;
    }


}
