package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法案例：银行账号管理
 * 实体类-BankAccount
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:05
 * @since Java21
 */
public class BankAccount {
    /************************************类的成员-成员变量************************************/

    /**
     * 账号
     */
    String id;

    /**
     * 账户名
     */
    String name;

    /**
     * 身份证号
     */
    String cardId;

    /**
     * 手机号
     */
    String tel;

    /**
     * 余额
     */
    double balance;


    /**
     * 年利率
     */
    static double rate;
    /************************************类的成员-成员方法-实例方法************************************/

    /**
     * 存款
     *
     * @param amount 存款金额
     */
    public void deposit(double amount) {
        if (amount > 0) {
            //更新余额
            balance += amount;
            System.out.println(name + "存款成功，当前余额：" + balance);
        } else {
            System.out.println(name + "存款金额必须大于0");
        }
    }

    /**
     * 取款
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(name + "取款成功，当前余额：" + balance);
        } else {
            System.out.println(name + "取款失败，余额不足或者余额无效");
        }
    }
}
