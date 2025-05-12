package net.ittimeline.java.core.api.util;

import java.math.BigDecimal;

/**
 * 商品类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 22:29
 * @since Java21
 */
public class Product  implements Comparable<Product> {


    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */

    private BigDecimal price;


    public String getName() {
        return name;
    }


    public BigDecimal getPrice() {
        return price;
    }


    public Product() {

    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        // 排序规则：按照价格升序排序
        //return this.price.compareTo(product.getPrice());
        // 排序规则：按照价格降序排序
        //return -this.price.compareTo(product.getPrice());
        // 排序规则:先按照价格升序排序，如果价格相等，则按照商品名称进行升序排序
        int result = this.price.compareTo(product.getPrice());
        //int result = this.price.compareTo(product.getPrice());
        if (result != 0) {
            return result;
        }else{
            return this.name.compareTo(product.getName());
        }

    }
}
