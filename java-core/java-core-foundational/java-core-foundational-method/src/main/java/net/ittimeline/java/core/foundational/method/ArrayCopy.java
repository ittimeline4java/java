package net.ittimeline.java.core.foundational.method;

/**
 * 方法重载案例-数组复制
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 17:07
 * @since Java21
 */
public class ArrayCopy {
    /**
     * 数组复制-将元数组的内容复制到新数组
     *
     * @param array 原数组
     * @return 新数组
     */
    public static int[] copy(int[] array) {
        // 原数组为空校验
        if (array == null) {
            throw new IllegalArgumentException("原数组不能为null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("原数组长度不能为零");
        }

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }


    /**
     * 数组复制-将指定范围的原数组复制到新数组
     *
     * @param array 原数组
     * @param start 开始范围
     * @param end   结束范围
     * @return 新数组
     */
    public static int[] copy(int[] array, int start, int end) {
        // 原数组为空校验
        if (array == null) {
            throw new IllegalArgumentException("原数组不能为null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("原数组长度不能为零");
        }

        // 起始/结束索引有效性校验
        if (start < 0) {
            throw new IllegalArgumentException("起始索引不能为负数（start=" + start + ")");
        }
        if (end >= array.length) {
            throw new IllegalArgumentException("结束索引越界（end=" + end + "，最大允许=" + (array.length - 1) + ")");
        }
        if (start > end) {
            throw new IllegalArgumentException("起始索引不能大于结束索引（start=" + start + "，end=" + end + ")");
        }

        // 计算新数组长度并创建
        int length = end - start + 1;
        int[] newArray = new int[length];
        //循环拷贝array数组的元素到新数组中，从start开始拷贝，到end结束
        for (int i = start; i <= end; i++) {
            //newArray数组的索引是从0开始
            //array数组的索引是从i开始
            newArray[i - start] = array[i];
        }
        return newArray;
    }

}
