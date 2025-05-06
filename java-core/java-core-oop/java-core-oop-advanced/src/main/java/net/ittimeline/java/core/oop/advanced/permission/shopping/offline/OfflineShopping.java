package net.ittimeline.java.core.oop.advanced.permission.shopping.offline;

import net.ittimeline.java.core.oop.advanced.permission.shopping.ShoppingProcess;

/**
 * 权限修饰符案例：购物系统
 * 具体实现类：线下购物流程
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:19
 * @since Java21
 */
public class OfflineShopping extends ShoppingProcess {
    @Override
    protected void selectPaymentMethod() {
        System.out.println("选择支付方式：货到付款（现金）");
    }

    @Override
    protected void selectDeliveryMethod() {
        System.out.println("选择配送方式：门店自提");
    }
}
