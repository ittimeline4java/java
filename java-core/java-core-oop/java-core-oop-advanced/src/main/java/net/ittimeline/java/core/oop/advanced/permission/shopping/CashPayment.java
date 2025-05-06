package net.ittimeline.java.core.oop.advanced.permission.shopping;

/**
 * 权限修饰符案例：购物系统
 * 具体支付方式：现金支付
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:16
 * @since Java21
 */
public class CashPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("使用现金支付了 " + amount + " 元。");
    }
}
