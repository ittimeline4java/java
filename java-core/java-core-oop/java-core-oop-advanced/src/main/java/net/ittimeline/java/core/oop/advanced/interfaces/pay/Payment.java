package net.ittimeline.java.core.oop.advanced.interfaces.pay;

/**
 * 接口案例：支付接口多种支付方式
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:56
 * @since Java21
 */
public interface Payment {
    /**
     * 支付
     * @param amount 支付金额
     */
    void pay(double amount);

}
