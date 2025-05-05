package net.ittimeline.java.core.oop.foundational.clazz.field;

/**
 * 成员变量案例-银行账户类与对象
 * 需求：工商银行管理系统需要存储每个银行的账户信息，包括账号、户名、身份证号、手机号、余额、年利率等，其中利率是统一的，都是0.011（1.10%），请设计银行账户类，并创建不同的对象来展示信息。
 * 分析：略
 * @author tony 18601767221@163.com
 * @version 2025/5/5 7:38
 * @since Java21
 */
public class BankAccountTest {
    public static void main(String[] args) {
        //static修饰的成员变量，可以直接通过类名访问
        //设置年利率为0.011
        BankAccount.rate = 0.011;

        //创建两个BankAccount对象，并初始化其属性值

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.id = "6214830214120445";
        bankAccount1.name = "tony";
        bankAccount1.cardId = "421023197802122222";
        bankAccount1.tel = "18688888888";
        bankAccount1.balance = 100_0000;


        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.id = "6214830214120446";
        bankAccount2.name = "jack";
        bankAccount2.cardId = "421023198002122223";
        bankAccount2.tel = "18699999999";
        bankAccount2.balance = 200_0000;

        System.out.println("工商银行账户列表");

        //%-40s 表示格式化长度为40的字符串，并且左对齐
        System.out.printf("%-40s %-25s %-35s %-30s %-25s %-10s\n", "账号", "账户名", "身份证号", "手机号", "余额", "年利率");
        //打印输出两个BankAccount对象的属性值
        System.out.printf("%-40s %-25s %-35s %-35s %-20.2f %15.3f\n", bankAccount1.id, bankAccount1.name, bankAccount1.cardId, bankAccount1.tel, bankAccount1.balance, BankAccount.rate);
        System.out.printf("%-40s %-25s %-35s %-35s %-20.2f %15.3f\n", bankAccount2.id, bankAccount2.name, bankAccount2.cardId, bankAccount2.tel, bankAccount2.balance, BankAccount.rate);

    }
}
