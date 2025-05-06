package net.ittimeline.java.core.oop.advanced.permission.shopping;

/**
 * 权限修饰符案例：购物系统
 * 具体支付方式：信用卡
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:17
 * @since Java21
 */
public class CreditCardPayment  implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("使用信用卡支付了 " + amount + " 元。");
    }
}
