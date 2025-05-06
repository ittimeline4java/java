package net.ittimeline.java.core.oop.intermediate.inheritance.override;

/**
 * 方法重写案例：计算利息
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:39
 * @since Java21
 */
public class Account {
    /**
     * 账户余额
     */
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 计算年利息
     *
     * @return 年利息金额
     */
    public double calculateInterest() {
        return 0.0; // 默认不计算利息
    }
}
