package net.ittimeline.java.core.api.util;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 对象数组排序-基于实现Comparator接口的比较器
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/12 10:24
 * @since Java21
 */
public class ArraysSortComparatorTest {
    static Product[] products;

    static {
        products = new Product[]{
                new Product("vivo X200 Ultra", BigDecimal.valueOf(7999.00)),
                new Product("xiaomi 15 Ultra", BigDecimal.valueOf(7799.00)),
                new Product("iPhone 16 Pro Max", BigDecimal.valueOf(12536.01)),
                new Product("OPPO Find X8 Ultra", BigDecimal.valueOf(7999.00)),
                new Product("Honor Magic7 RSR", BigDecimal.valueOf(7499.00))};
    }

    public static void main(String[] args) {
        System.out.println("********************************1.按照价格升序排序********************************");
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("********************************2.按照价格降序排序********************************");
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return -o1.getPrice().compareTo(o2.getPrice());
            }
        });
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("********************************3.按照价格升序排序，价格相同按照商品名称升序排序********************************");
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                int priceCompare = o1.getPrice().compareTo(o2.getPrice());
                if (priceCompare == 0) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return priceCompare;
                }
            }
        });
        for (Product product : products) {
            System.out.println(product);
            }

    }
}
