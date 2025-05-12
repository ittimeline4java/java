package net.ittimeline.java.core.api.util;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Arrays常用方法测试-toString方法。
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/12 7:23
 * @since Java21
 * @see Product
 */
public class ArraysToStringTest {

    static Product[] products;
    static{
        products = new Product[]{
                new Product("vivo X200 Ultra", BigDecimal.valueOf(7999.00)),
                new Product("xiaomi 15 Ultra", BigDecimal.valueOf(7799.00)),
                new Product("iPhone 16 Pro Max", BigDecimal.valueOf(12536.01)),
                new Product("OPPO Find X8 Ultra", BigDecimal.valueOf(7999.00)),
                new Product("Honor Magic7 RSR", BigDecimal.valueOf(7499.00))};
    }

    /**
     * @see Arrays#toString(long[])
     * @see Arrays#toString(double[]) 
     * @see Arrays#toString(Object[])
     *
     * @param args
     */
    public static void main(String[] args) {
        double[] doubleArray = {100.0, 200.0, 300.0};
        System.out.println(Arrays.toString(doubleArray));

        long[] longArray = {10000000L, 200000000L, 300000000L};
        System.out.println(Arrays.toString(longArray));

        Product[] productArray = products;
        System.out.println(Arrays.toString(productArray));

    }
}
