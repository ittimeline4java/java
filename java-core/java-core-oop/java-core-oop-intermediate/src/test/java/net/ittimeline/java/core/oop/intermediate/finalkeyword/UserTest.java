package net.ittimeline.java.core.oop.intermediate.finalkeyword;

/**
 * final关键字修饰静态变量案例
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 9:41
 * @since Java21
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User("admin", "111111");
        boolean result = user.login();
        if (result) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
