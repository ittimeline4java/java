package net.ittimeline.java.core.oop.intermediate.encapsulation.method;

/**
 * 方法封装案例：支付
 * 需求：一个支付系统支持多种支付方式（支付宝、微信、银行卡），但支付逻辑可能变化
 * 分析：略
 * 测试类-PaymentTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:25
 * @since Java21
 */
public class PaymentTest {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("Alipay", 100.0); // 输出：调用支付宝API...
    }
}
