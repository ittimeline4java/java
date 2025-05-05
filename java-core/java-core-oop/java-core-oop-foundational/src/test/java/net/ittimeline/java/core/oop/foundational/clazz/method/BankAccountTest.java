package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法案例：银行账号管理
 * 需求：计算圆的面积和周长，圆有半径属性
 * 分析：略
 * 测试类-BankAccountTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:06
 * @since Java21
 */
public class BankAccountTest {
    public static void main(String[] args) {
        //创建BankAccount对象
        BankAccount bankAccount = new BankAccount();
        //设置账号
        bankAccount.name = "tony";
        //调用存款方法
        bankAccount.deposit(20000);
        //调用取款方法
        bankAccount.withdraw(2000);
    }
}
