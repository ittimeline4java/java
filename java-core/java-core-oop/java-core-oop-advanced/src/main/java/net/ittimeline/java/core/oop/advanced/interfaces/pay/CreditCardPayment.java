package net.ittimeline.java.core.oop.advanced.interfaces.pay;

/**
 * 接口案例：支付接口多种支付方式
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:57
 * @since Java21
 */
public class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("使用信用卡 " + cardNumber + " 支付了 " + amount + " 元。");

    }
}
