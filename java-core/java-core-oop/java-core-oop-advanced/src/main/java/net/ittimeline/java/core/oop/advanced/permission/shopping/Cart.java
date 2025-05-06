package net.ittimeline.java.core.oop.advanced.permission.shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * 权限修饰符案例：购物系统
 * 购物车类
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:15
 * @since Java21
 */
public class Cart {
    private List<Product> products = new ArrayList<>();

    // 添加商品到购物车
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("已将商品 " + product.getName() + " 添加到购物车。");
    }

    // 移除商品
    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("已将商品 " + product.getName() + " 从购物车移除。");
    }

    // 计算总金额
    public double calculateTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // 查看购物车中的商品
    public void viewCart() {
        if (products.isEmpty()) {
            System.out.println("购物车为空！");
        } else {
            System.out.println("购物车中的商品：");
            for (Product product : products) {
                System.out.println("- " + product.getName() + "，价格：" + product.getPrice() + " 元");
            }
        }
    }
}
