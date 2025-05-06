package net.ittimeline.java.core.oop.advanced.interfaces.pay;

/**
 * 接口案例：支付接口多种支付方式
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:56
 * @since Java21
 */
public class AlipayPayment implements Payment {
    private String account;

    public AlipayPayment(String account) {
        this.account = account;
    }


    @Override
    public void pay(double amount) {
        System.out.println("使用支付宝账户 " + account + " 支付了 " + amount + " 元。");
    }
}
