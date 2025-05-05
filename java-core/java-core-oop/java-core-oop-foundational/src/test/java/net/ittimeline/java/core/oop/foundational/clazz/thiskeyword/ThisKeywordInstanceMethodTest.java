package net.ittimeline.java.core.oop.foundational.clazz.thiskeyword;

/**
 * this关键字使用-调用实例方法
 * 测试类-ThisKeywordInstanceMethodTest
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 15:06
 * @since Java21
 */
public class ThisKeywordInstanceMethodTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("6214830214120445", 1000.0);

        account.printAccountInfo();
        account.deposit(500.0); // 存款500
        account.withdraw(200.0); // 取款200
        account.printAccountInfo();
    }
}
