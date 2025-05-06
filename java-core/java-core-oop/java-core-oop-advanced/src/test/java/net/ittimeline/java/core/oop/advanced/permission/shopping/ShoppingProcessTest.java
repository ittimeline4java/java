package net.ittimeline.java.core.oop.advanced.permission.shopping;

import net.ittimeline.java.core.oop.advanced.permission.shopping.offline.OfflineShopping;
import net.ittimeline.java.core.oop.advanced.permission.shopping.online.OnlineShopping;

/**
 * 权限修饰符案例：购物系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:21
 * @since Java21
 */
public class ShoppingProcessTest {
    public static void main(String[] args) {
        System.out.println("********************************线上购物流程********************************");
        // 创建线上商品
        Product product1 = new Product("iphone 16 pro max", 12999);
        Product product2 = new Product("Air Pods Pro ", 1600);

        // 创建在线购物流程
        ShoppingProcess onlineShopping = new OnlineShopping();
        onlineShopping.addItemToCart(product1);  // 添加商品到购物车
        onlineShopping.addItemToCart(product2);  // 添加商品到购物车
        onlineShopping.setPaymentMethod(new CreditCardPayment());  // 设置支付方式为信用卡支付
        onlineShopping.completeShopping();  // 完成购物流程

        System.out.println("********************************线下购物流程********************************");

        // 创建线下购物流程
        //创建线下商品
        Product product3=new Product("MacBook Pro 16",45999);
        ShoppingProcess offlineShopping = new OfflineShopping();
        offlineShopping.addItemToCart(product3);  // 添加商品到购物车
        offlineShopping.setPaymentMethod(new CashPayment());  // 设置支付方式为现金支付
        offlineShopping.completeShopping();  // 完成购物流程
    }

}
