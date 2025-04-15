package net.ittimeline.java.core.foundational.method;

/**
 * 多方法调用内存原理
 * 方法之间的调用原理：方法在虚拟机栈内存中执行，特点是先进后出
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:51
 * @since Java21
 */
public class MultiMethodInvocationPrinciple {
    public static void main(String[] args) {
        doShopping();
    }


    public static void doShopping() {
        System.out.println("开始购物");
        browser();
        shoppingCart();
        pay();
        System.out.println("坐等收货");
    }

    public static void browser() {
        System.out.println("浏览商品");
    }

    public static void shoppingCart() {
        System.out.println("添加到购物车");
    }


    public static void pay() {
        System.out.println("下单支付");
    }

}
