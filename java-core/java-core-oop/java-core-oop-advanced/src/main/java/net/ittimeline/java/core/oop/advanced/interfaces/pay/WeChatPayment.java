package net.ittimeline.java.core.oop.advanced.interfaces.pay;

/**
 * 接口案例：支付接口多种支付方式
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:57
 * @since Java21
 */
public class WeChatPayment implements Payment {
    private String openId;

    public WeChatPayment(String openId) {
        this.openId = openId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("使用微信账户 " + openId + " 支付了 " + amount + " 元。");
    }
}
