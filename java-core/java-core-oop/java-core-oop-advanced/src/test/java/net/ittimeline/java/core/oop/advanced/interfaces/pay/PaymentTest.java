package net.ittimeline.java.core.oop.advanced.interfaces.pay;

/**
 * 接口案例：支付接口多种支付方式
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:58
 * @since Java21
 */
public class PaymentTest {
    public static void main(String[] args) {
        //接口多态
        Payment creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        Payment alipayPayment = new AlipayPayment("alice@alipay.com");
        Payment wechatPayment = new WeChatPayment("wx_123456789");

        creditCardPayment.pay(150.75);
        alipayPayment.pay(200.50);
        wechatPayment.pay(99.99);
    }
}
