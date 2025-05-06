package net.ittimeline.java.core.oop.intermediate.inheritance.override;

/**
 * 方法重写案例：计算利息
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:41
 * @since Java21
 */
public class CreditCardAccount extends Account {

    /**
     * 重写父类计算年利息方法
     *
     * @return 信用卡账号利息
     */
    @Override
    public double calculateInterest() {
        //信用卡账号年利率10%
        //super.getBalance()调用父类的getBalance()方法
        return super.getBalance() * 0.10;
    }
}
