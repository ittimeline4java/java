package net.ittimeline.java.core.oop.advanced.enums;

/**
 * 枚举实现接口案例：支付方式枚举
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:38
 * @since Java21
 */
public enum PaymentMethod implements PaymentProcessor {


    CASH {
        @Override
        public void processPayment(double amount) {
            System.out.println("现金支付" + amount + "元");
        }
    },
    WeChatPay {
        @Override
        public void processPayment(double amount) {
            System.out.println("微信支付" + amount + "元");

        }
    },
    AliPay {
        @Override
        public void processPayment(double amount) {
            System.out.println("支付宝支付" + amount + "元");
        }
    },
    BankCard {
        @Override
        public void processPayment(double amount) {
            System.out.println("银行卡支付" + amount + "元");
        }
    },
    CreditCard {
        @Override
        public void processPayment(double amount) {
            System.out.println("信用卡支付" + amount + "元");
        }
    }
}
