package net.ittimeline.java.core.oop.advanced.permission.shopping;

/**
 * 权限修饰符案例：购物系统
 * 商品类
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:14
 * @since Java21
 */
public class Product {
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
