package net.ittimeline.java.core.api.util;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 对象数组排序-基于实现Comparable接口的对象数组，可以直接使用Arrays.sort()方法进行排序。
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/12 9:38
 * @since Java21
 * @see Comparable
 */
public class ArraysSortComparableTest {
    static Product[] products;

    static {
        products = new Product[]{
                new Product("vivo X200 Ultra", BigDecimal.valueOf(7999.00)),
                new Product("xiaomi 15 Ultra", BigDecimal.valueOf(7799.00)),
                new Product("iPhone 16 Pro Max", BigDecimal.valueOf(12536.01)),
                new Product("OPPO Find X8 Ultra", BigDecimal.valueOf(7999.00)),
                new Product("Honor Magic7 RSR", BigDecimal.valueOf(7499.00))};
    }

    /**
     * @see Arrays#sort(Object[])
     * @param args
     */
    public static void main(String[] args) {
        Arrays.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
