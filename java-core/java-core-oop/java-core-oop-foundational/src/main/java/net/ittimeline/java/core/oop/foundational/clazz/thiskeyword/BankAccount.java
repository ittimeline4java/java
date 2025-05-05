package net.ittimeline.java.core.oop.foundational.clazz.thiskeyword;

/**
 * this关键字使用-调用实例方法
 * 实体类-BankAccount
 * @author tony 18601767221@163.com
 * @version 2025/5/5 15:05
 * @since Java21
 */
public class BankAccount {
    /**
     * 账号
     */
    String accountNumber;
    /**
     * 余额
     */
    double balance;


    // 构造器
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    /**
     * 获取余额
     *
     * @return 当前余额
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 存款
     *
     * @param amount 存款金额
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("存款成功！当前余额：" + this.getBalance());
        } else {
            System.out.println("存款金额必须大于0！");
        }
    }

    /**
     * 取款
     *
     * @param amount 取款金额
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            //this调用实例方法
            System.out.println("取款成功！当前余额：" + this.getBalance());
        } else {
            System.out.println("取款失败！余额不足或金额无效！");
        }
    }


    /**
     * 打印账户信息
     */
    public void printAccountInfo() {
        System.out.println("账户号码：" + this.accountNumber);
        //this调用实例方法
        System.out.println("账户余额：" + this.getBalance());
    }

}
