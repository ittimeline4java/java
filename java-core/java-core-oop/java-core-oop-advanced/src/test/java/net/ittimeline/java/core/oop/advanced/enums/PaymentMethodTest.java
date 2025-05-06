package net.ittimeline.java.core.oop.advanced.enums;

/**
 * 枚举实现接口案例：支付方式枚举
 * 枚举类实现接口，让枚举类的每一个对象重写接口中的抽象方法，当通过不同的枚举类对象调用此方法时，执行的是不同的实现方法。
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:38
 * @since Java21
 */
public class PaymentMethodTest {
    public static void main(String[] args) {
        PaymentMethod.AliPay.processPayment(100);
        PaymentMethod.WeChatPay.processPayment(200);
        PaymentMethod.BankCard.processPayment(1000);
        PaymentMethod.CreditCard.processPayment(2000);
    }
}
