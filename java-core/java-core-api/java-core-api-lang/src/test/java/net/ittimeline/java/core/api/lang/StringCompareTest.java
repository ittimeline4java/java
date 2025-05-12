package net.ittimeline.java.core.api.lang;

import java.util.Arrays;

/**
 * 字符串排序
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 22:26
 * @since Java21
 */
public class StringCompareTest {
    public static void main(String[] args) {
        String[] array = {"Tom", "Jack", "Tiffany","Jessica","Lucy","Jerry"};
        // 默认按照字典顺序排序
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
