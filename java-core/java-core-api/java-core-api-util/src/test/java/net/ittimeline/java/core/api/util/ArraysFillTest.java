package net.ittimeline.java.core.api.util;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Arrays fill()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/12 8:22
 * @since Java21
 */
public class ArraysFillTest {
    /**
     * 数组填充
     * @see Arrays#fill(int[], int)
     * @see Arrays#fill(Object[], Object)
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array, 100);
        System.out.println(Arrays.toString(array));

        Product[] products = new Product[3];
        Arrays.fill(products, new Product("xiaomi 15 Ultra", BigDecimal.valueOf(7799.00)));
        System.out.println(Arrays.toString(products));
    }
}
