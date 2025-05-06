package net.ittimeline.java.core.oop.intermediate.statickeyword;

/**
 * static关键字修饰成员方法案例
 * 工具类-ArrayUtils
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:39
 * @since Java21
 */
public class ArrayUtils {
    //私有化构造器
    private ArrayUtils() {

    }

    /**
     * 返回数组元素，采用字符串拼接
     *
     * @param array 整数数组
     * @return 数组元素，采用字符串拼接
     */
    public static String toString(int[] array) {
        if (null == array) {
            //结束当前方法
            return null;
        }
        String content = "[";

        for (int i = 0; i < array.length; i++) {
            //最后一个元素打印元素
            if (i == array.length - 1) {
                content += array[i];
            } else {
                //非最后一个元素打印元素再拼接一个,
                content += array[i] + ", ";
            }
        }
        content += "]";
        return content;
    }

    /**
     * 求数组元素最大值
     *
     * @param array 整数数组
     * @return 最大值
     */
    public static int max(int[] array) {
        if (null == array) {
            //抛出异常
            throw new IllegalArgumentException("数组不能为空");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    /**
     * 求数组最小值
     *
     * @param array 整数数组
     * @return 最小值
     */
    public static int min(int[] array) {
        // 检查数组是否为空
        if (null == array) {
            //抛出异常
            throw new IllegalArgumentException("数组不能为空");
        }

        // 初始化最小值变量为数组的第一个元素
        int min = array[0];

        // 遍历数组，寻找最小值
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素大于最小值，则更新最小值
            if (array[i] > min) {
                min = array[i];
            }
        }

        // 返回最小值
        return min;
    }

    /**
     * 求和
     *
     * @param array 整数数组
     * @return 数组的和
     */

    public static int sum(int[] array) {
        // 检查数组是否为空
        if (null == array) {
            //抛出异常
            throw new IllegalArgumentException("数组不能为空");
        }
        // 初始化数组和为0
        int sum = 0;
        // 遍历数组中的每个元素
        for (int i = 0; i < array.length; i++) {
            // 将当前元素的值加到和中
            sum += array[i];
        }
        // 返回数组的和
        return sum;
    }


    /**
     * 求数组平均值
     *
     * @param array 整数数组
     * @return 平均值
     */
    public static int avg(int[] array) {
        // 检查数组是否为空
        if (null == array) {
            //抛出异常
            throw new IllegalArgumentException("数组不能为空");
        }

        // 计算数组元素之和
        int sum = sum(array);

        // 计算平均值
        int avg = sum / array.length;

        return avg;
    }
}
