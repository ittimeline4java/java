package net.ittimeline.java.core.foundational.control.branch.ifelsestatment;

import java.util.Scanner;

/**
 * QQ登录
 * 需求：提示用户输入QQ账号和密码，如果账号是1079351401并且密码是124578963..go则提示登录成功，否则就提示账号或密码错误，登录失败
 * 分析：账号、密码都是字符串类型，字符串判断相等需要使用public boolean equals(Object anObject)方法
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 10:35
 * @since Java21
 */
public class QQLogin {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号");
        String account = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        if (account.equals("1079351401") && password.equals("124578963..go")) {
            System.out.println("登录成功");
        } else {
            System.out.println("账号或密码错误，登录失败");
        }
        //关闭Scanner
        scanner.close();
    }
}
