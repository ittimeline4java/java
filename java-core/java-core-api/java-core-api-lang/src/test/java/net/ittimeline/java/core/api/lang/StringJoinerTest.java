package net.ittimeline.java.core.api.lang;

import java.util.StringJoiner;

/**
 * StringJoiner常用方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 17:55
 * @since Java21
 */
public class StringJoinerTest {

    /**
     * 数组转字符串
     * @param array 数组
     * @return 字符串 数组转字符串，例如：[1,2,3]
     * @see StringJoiner#add(CharSequence)
     * @see StringJoiner#toString()
     */
    public static String arrayToString(int[] array) {
        if (array == null || array.length == 0) {
            return "[]";
        }
        StringJoiner   joiner = new StringJoiner(",", "[", "]");
        for (int i = 0; i < array.length; i++) {
            joiner.add(String.valueOf(array[i]));
        }
        return joiner.toString();
    }

    public static void main(String[] args) {
        System.out.println(arrayToString(new int[]{1, 2, 3}));
        System.out.println(arrayToString(new int[]{}));
        System.out.println(arrayToString(null));
    }
}
