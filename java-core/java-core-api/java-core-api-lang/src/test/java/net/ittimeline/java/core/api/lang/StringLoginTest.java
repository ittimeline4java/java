package net.ittimeline.java.core.api.lang;

import java.util.Scanner;

/**
 * 字符串案例：用户登录
 * 需求：已知正确的用户名和密码（admin/123456），请用程序模拟用户登录，总共三次机会，登录之后给出相应的提示
 * 分析：略
 * @author tony 18601767221@163.com
 * @version 2025/5/11 10:02
 * @since Java21
 */
public class StringLoginTest {
    /**
     * 正确的用户名
     */
    private static final String USER_NAME = "admin";
    /**
     * 正确的密码
     */
    private static final String PASSWORD = "123456";

    /**
     * 最大登录次数
     */
    private static final  int MAX_LOGIN_TIMES = 3;

    public static void main(String[] args) {
        // 创建Scanner对象
        // System.in表示标准输入，也就是键盘输入
        // Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= MAX_LOGIN_TIMES; i++) {
            // 提示用户输入用户名
            System.out.println("请输入用户名：");
            String inputUserName = scanner.next();

            // 提示用户输入密码
            System.out.println("请输入密码：");
            String inputPassword = scanner.next();

            // 判断用户名和密码是否匹配
            if (USER_NAME.equals(inputUserName) && PASSWORD.equals(inputPassword)) {
                // 登录成功，跳出循环
                System.out.println("登录成功！");
                break;
            } else {
                if (i == MAX_LOGIN_TIMES) {
                    System.out.println("三次机会都已经用完了，账户"+inputUserName+"已经被锁定，请联系管理员！");
                }else{
                    // 登录失败
                    System.out.println("用户名或密码错误，你还剩"+(MAX_LOGIN_TIMES-i)+"次机会，请重新输入！");
                }

            }
        }

        // 关闭Scanner
        scanner.close();

    }

}
