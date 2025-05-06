package net.ittimeline.java.core.oop.intermediate.inheritance.override;

/**
 * 方法重写案例：计算年利息
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:42
 * @since Java21
 */
public class AccountTest {
    public static void main(String[] args) {
        // 创建一个账户对象
        Account account = new Account();
        // 设置账户余额为100000
        account.setBalance(100000);
        // 计算并获取利息
        double interest = account.calculateInterest();
        // 打印利息
        System.out.println("默认利息：" + interest);

        // 创建一个储蓄账户对象
        SavingsAccount savingsAccount = new SavingsAccount();
        // 设置储蓄账户余额为100000
        savingsAccount.setBalance(100000);
        // 计算并获取储蓄利息
        double savingsInterest = savingsAccount.calculateInterest();
        // 打印储蓄利息
        System.out.println("储蓄利息：" + savingsInterest);

        // 创建一个信用卡账户对象
        CreditCardAccount creditCardAccount = new CreditCardAccount();
        // 设置信用卡账户余额为100000
        creditCardAccount.setBalance(100000);
        // 计算并获取信用卡利息
        double creditInterest = creditCardAccount.calculateInterest();
        // 打印信用卡利息
        System.out.println("信用卡利息：" + creditInterest);
    }
}
