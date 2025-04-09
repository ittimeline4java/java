package net.ittimeline.java.core.foundational.control.loop.breakstatement;

import java.util.Scanner;

/**
 * 淘宝用户登录
 * 需求：让用户输入指定的账号密码，如果账号密码正确就提示登录成功，否则就提示还剩多少次机会，一天最多只能登录3次，如果3次登录失败，就锁定账号
 * 指定的账号密码是tony/124578963..go
 * 分析：
 * 提示用户输入账号密码
 * 将用户输入的账号密码和指定的账号密码进行比较(字符串相等性比较)
 * a. 如果用户输入的账号密码和指定的账号密码相等，那么提示欢迎登录淘宝网站，然后程序退出
 * b. 如果用户输入的账号密码和指定的账号密码不相等，那么提示 账号密码错误，还剩下?次机会
 * c. 如果3次登录失败，就锁定账号，然后程序退出
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/9 12:07
 * @since Java21
 */
public class TaoBaoUserLogin {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count <= 3) {
            System.out.println("请输入用户名");
            String userName = scanner.next();
            System.out.println("请输入密码");
            String password = scanner.next();
            count--;
            //登录成功
            if (userName.equals("tony") && password.equals("124578963..go")) {
                System.out.println("欢迎登录淘宝网站");
                break;
            }
            //登录失败
            else {
                if (count > 0) {
                    System.out.println("用户名或密码错误，登录失败，你还有" + count + "次机会");
                } else {
                    System.out.println("用户名或密码错误，连续3次登录失败，账号被锁定，程序即将退出");
                    break;
                }
            }
        }
        //关闭Scanner
        scanner.close();

    }
}
