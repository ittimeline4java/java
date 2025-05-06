package net.ittimeline.java.core.oop.advanced.permission.shopping.online;

import net.ittimeline.java.core.oop.advanced.permission.shopping.ShoppingProcess;

/**
 * 权限修饰符案例：购物系统
 * 具体实现类：线上购物流程
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:20
 * @since Java21
 */
public class OnlineShopping extends ShoppingProcess {
    @Override
    protected void selectPaymentMethod() {
        System.out.println("选择支付方式：在线支付（信用卡）");
    }

    @Override
    protected void selectDeliveryMethod() {
        System.out.println("选择配送方式：快递配送");
    }
}
